package evaluator;

import helper.CommonUtils;
import helper.FilterFunctions;
import helper.RelativePathFunctions;
import helper.XMLParser;
import org.w3c.dom.Node;

import java.util.*;

import static evaluator.QueryEvaluator.BASE_FILE_PATH;
import static evaluator.QueryEvaluator.compute;
import static helper.CommonUtils.*;

public class XPathEvaluatorUtils {

    public static EvaluatorState handleAbsolutePath(EvaluatorState state) {
        String filename = getValidChild(state.tree, 1).getText().replaceAll("\"", "");
        String absolutePath = BASE_FILE_PATH + filename;
        // calculate time to parse the xml file
        long startTime = System.currentTimeMillis();
        XMLParser parser = new XMLParser(absolutePath);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to parse the XML file: " + (endTime - startTime) + "ms");
        Node root = parser.root;
        if (getValidChild(state.tree, 3).getText().equals("/")){
            state.tree = getValidChild(state.tree, 4);
            state.path = "";
            state.isRecursive = false;
            state.currentCandidates = Collections.singletonList(root);
            state = compute(state);
            return state;
        }
        else if (getValidChild(state.tree, 3).getText().equals("//")){
            state.tree = getValidChild(state.tree, 4);
            state.path = "";
            state.isRecursive = true;
            state.currentCandidates = RelativePathFunctions.getAllChildren(root);
            state = compute(state);
            assert state != null;
            state.currentCandidates = CommonUtils.getUniqueNodes(state.currentCandidates);
            return state;
        }
        return null;
    }

    public static EvaluatorState handleRelativePath(EvaluatorState state) {
        int childCount = getValidChildCount(state.tree);
        if (childCount == 1){
            EvaluatorState intermediateResult = new EvaluatorState(state);
            intermediateResult.tree = getValidChild(state.tree, 0);
            intermediateResult = compute(intermediateResult);
            assert intermediateResult != null;
            state.currentCandidates = intermediateResult.currentCandidates;
            state.filterMask = intermediateResult.filterMask;
        }
        else if (childCount == 2){
            EvaluatorState intermediateResult = new EvaluatorState(state);
            intermediateResult.tree = getValidChild(state.tree, 0);
            intermediateResult = compute(intermediateResult);
            assert intermediateResult != null;
            intermediateResult.tree = getValidChild(state.tree, 1);
            intermediateResult = compute(intermediateResult);
            assert intermediateResult != null;
            state.currentCandidates = intermediateResult.currentCandidates;
            state.filterMask = intermediateResult.filterMask;
        }
        else{
            EvaluatorState intermediateResult = new EvaluatorState(state);
            intermediateResult.tree = getValidChild(state.tree, 0);
            intermediateResult = compute(intermediateResult);
            intermediateResult.isRecursive = getValidChild(state.tree, 1).getText().equals("//");
            assert intermediateResult != null;
            if (getValidChild(state.tree, 1).getText().equals(",")){
                EvaluatorState intermediateResult2 = new EvaluatorState(state);
                intermediateResult2.tree = getValidChild(state.tree, 2);
                intermediateResult2 = compute(intermediateResult2);
                assert intermediateResult2 != null;
                state.currentCandidates = RelativePathFunctions.mergeLists(
                        intermediateResult.currentCandidates,
                        intermediateResult2.currentCandidates);
            }else{
                intermediateResult.currentCandidates = CommonUtils.getUniqueNodes(intermediateResult.currentCandidates);
                intermediateResult.tree = getValidChild(state.tree, 2);
                intermediateResult = compute(intermediateResult);
                assert intermediateResult != null;
                intermediateResult.currentCandidates = CommonUtils.getUniqueNodes(intermediateResult.currentCandidates);
                state.currentCandidates = intermediateResult.currentCandidates;
                state.filterMask = intermediateResult.filterMask;
            }
        }
        return state;
    }

    public static EvaluatorState handleTagName(EvaluatorState state) {
        String tagName = state.tree.getText();
        if (!state.isRecursive){
            state.currentCandidates = RelativePathFunctions.getNodesConcatenatedPath(state.currentCandidates, tagName);
        }
        else{
            state.currentCandidates = RelativePathFunctions.getNodesConcatenatedPathRecursive(state.currentCandidates, tagName);
            state.isRecursive = false;
        }
        return state;
    }

    public static EvaluatorState handleChildren(EvaluatorState state) {
        if (!state.isRecursive){
            List<Node> result = new ArrayList<>();
            for (Node n : state.currentCandidates){
                result.addAll(RelativePathFunctions.getAllChildren(n));
            }
            state.currentCandidates = result;
        }
        else{
            List<Node> result = new ArrayList<>();
            for (Node n : state.currentCandidates){
                result.addAll(RelativePathFunctions.getAllChildrenRecursive(n));
            }
            state.currentCandidates = result;
            state.isRecursive = false;
        }
        return state;
    }

    public static EvaluatorState handleCurrent(EvaluatorState state) {
        return state;
    }

    public static EvaluatorState handleParent(EvaluatorState state) {
        Set<Node> result = new HashSet<>();
        for (Node n : state.currentCandidates){
            result.addAll(RelativePathFunctions.getParent(n));
        }
        state.currentCandidates = new ArrayList<>(result);
        return state;
    }

    public static EvaluatorState handleAttribute(EvaluatorState state) {
        String attrName = getValidChild(state.tree, 2).getText();
        List<Node> result = new ArrayList<>();
        for (Node n : state.currentCandidates){
            Node attr = RelativePathFunctions.getAttribute(n, attrName);
            if (attr != null){
                result.add(attr);
            }
        }
        state.currentCandidates = result;
        return state;
    }

    public static EvaluatorState handleTextFunction(EvaluatorState state) {
        List<Node> result = new ArrayList<>();
        for (Node n : state.currentCandidates){
            Node text = RelativePathFunctions.getText(n);
            if (text != null){
                result.add(text);
            }
        }
        state.currentCandidates = result;
        return state;
    }
    public static EvaluatorState handleInParenthesis(EvaluatorState state) {
        state.tree = getValidChild(state.tree, 1);
        return compute(state);
    }

    public static EvaluatorState handleFilter(EvaluatorState state) {
        EvaluatorState intermediateResult = new EvaluatorState(state);
        intermediateResult.tree = getValidChild(state.tree, 1);
        intermediateResult = computeFilter(intermediateResult);
        assert intermediateResult != null;
        state.filterMask = intermediateResult.filterMask;
        List<Node> result = new ArrayList<>();
        for (int i = 0; i < state.currentCandidates.size(); i++){
            if (state.filterMask.get(i)){
                result.add(state.currentCandidates.get(i));
            }
        }
        state.currentCandidates = result;
        return state;
    }

    public static EvaluatorState computeFilter(EvaluatorState state) {
        int childCount = getValidChildCount(state.tree);

        if (childCount == 1){
            List<Boolean> result = new ArrayList<>();
            for (int i = 0; i < state.currentCandidates.size(); i++){
                EvaluatorState intermediateResult = new EvaluatorState(state);
                intermediateResult.tree = getValidChild(state.tree, 0);
                intermediateResult.currentCandidates = Collections.singletonList(state.currentCandidates.get(i));
                intermediateResult = compute(intermediateResult);
                assert intermediateResult != null;
                if (intermediateResult.filterMask.size() == 0){
                    result.add(intermediateResult.currentCandidates.size() > 0);
                } else {
                    result.add(intermediateResult.filterMask.stream().anyMatch(x -> x));
                }
            }
            state.filterMask = result;
            return state;
        } else if (childCount == 2) {
            if (getValidChild(state.tree, 0).getText().equals("not")) {
                List<Boolean> result = new ArrayList<>();
                for (int i = 0; i < state.currentCandidates.size(); i++){
                    EvaluatorState intermediateResult = new EvaluatorState(state);
                    intermediateResult.tree = getValidChild(state.tree, 1);
                    intermediateResult.currentCandidates = Collections.singletonList(state.currentCandidates.get(i));
                    intermediateResult = compute(intermediateResult);
                    assert intermediateResult != null;
                    result.add(intermediateResult.filterMask.stream().noneMatch(x -> x));
                }
                state.filterMask = result;
                return state;
            }
        }  else{
            if (getValidChild(state.tree, 0).getText().equals("(") && getValidChild(state.tree, 2).getText().equals(")")){
                state.tree = getValidChild(state.tree, 1);
                return computeFilter(state);
            } else{
                String operator = getValidChild(state.tree, 1).getText();
                List<Boolean> result = new ArrayList<>();
                for (int i = 0; i < state.currentCandidates.size(); i++){
                    EvaluatorState intermediateResultLHS = new EvaluatorState(state);
                    intermediateResultLHS.tree = getValidChild(state.tree, 0);
                    intermediateResultLHS.currentCandidates = Collections.singletonList(state.currentCandidates.get(i));
                    intermediateResultLHS = compute(intermediateResultLHS);
                    assert intermediateResultLHS != null;
                    EvaluatorState intermediateResultRHS = new EvaluatorState(state);
                    intermediateResultRHS.tree = getValidChild(state.tree, 2);
                    intermediateResultRHS.currentCandidates = Collections.singletonList(state.currentCandidates.get(i));
                    intermediateResultRHS = compute(intermediateResultRHS);
                    assert intermediateResultRHS != null;
                    switch (operator){
                        case "=":
                        case "eq":
                            boolean res = false;
                            for(Node n1 : intermediateResultLHS.currentCandidates){
                                for(Node n2 : intermediateResultRHS.currentCandidates){
                                    res = res || FilterFunctions.isValueEqual(n1, n2);
                                }
                            }
                            result.add(res);
                            break;
                        case "==":
                        case "is":
                            res = false;
                            for(Node n1 : intermediateResultLHS.currentCandidates){
                                for(Node n2 : intermediateResultRHS.currentCandidates){
                                    res = res || FilterFunctions.identical(n1, n2);
                                }
                            }
                            result.add(res);
                            break;
                        case "and":
                            // check if any of the value in filter mask is true for intermediateResultLHS and intermediateResultRHS
                            boolean resLHS = intermediateResultLHS.filterMask.stream().anyMatch(x -> x);
                            boolean resRHS = intermediateResultRHS.filterMask.stream().anyMatch(x -> x);
                            result.add(resLHS && resRHS);
                            break;
                        case "or":
                            // check if any of the value in filter mask is true for intermediateResultLHS or intermediateResultRHS
                            boolean resLHSOr = intermediateResultLHS.filterMask.stream().anyMatch(x -> x);
                            boolean resRHSOr = intermediateResultRHS.filterMask.stream().anyMatch(x -> x);
                            result.add(resLHSOr || resRHSOr);
                            break;
                        default:
                            break;
                    }

                }
                state.filterMask = result;
                return state;
            }
        }
        return state;
    }

    public static EvaluatorState handleStringConstantText(EvaluatorState state) {
        String text = state.tree.getText().replaceAll("\"", "");
        List<Node> result = new ArrayList<>();
        for (Node n : state.currentCandidates){

            result.add(RelativePathFunctions.getTextNode(text, n));
        }
        state.currentCandidates = result;
        return state;
    }
}
