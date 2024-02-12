package parser_utils;
import evaluator.FilterFunctions;
import evaluator.RelativePathFunctions;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.w3c.dom.Node;


import java.io.IOException;
import java.util.*;

public class QueryEvaluator {
    public EvaluatorState state;
    final static String BASE_FILE_PATH = "src/main/resources/data/";

    public XMLParser parser;

    public QueryEvaluator(String query_file, Boolean isFile) {
        CharStream stream = null;
        try {
            stream = CharStreams.fromFileName(query_file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XPathLexer lexer = new XPathLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XPathParser parser = new XPathParser(tokens);
        state = new EvaluatorState(parser.eval(), "", null, false);
    }

    public QueryEvaluator(String query) {
        CharStream stream = CharStreams.fromString(query);
        XPathLexer lexer = new XPathLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XPathParser parser = new XPathParser(tokens);
        state = new EvaluatorState(parser.eval(), "", null, false);
    }

    public QueryEvaluator(EvaluatorState state) {
        this.state = state;
    }
    public EvaluatorState evaluate() {
        return compute(state);
    }

    private EvaluatorState compute(EvaluatorState state) {
        if (state.tree instanceof XPathParser.EvalContext){
            state.tree = state.tree.getChild(0);
            return compute(state);
        }
        else if (state.tree instanceof XPathParser.AbsolutePathContext){
            return handleAbsolutePath(state);
        }
        else if (state.tree instanceof XPathParser.RelativePathContext){
            return handleRelativePath(state);
        }

        else if (state.tree instanceof XPathParser.TagNameContext){
            return handleTagName(state);
        }

        else if (state.tree instanceof XPathParser.ChildrenContext){
            return handleChildren(state);
        }
        else if (state.tree instanceof XPathParser.CurrentContext){
            return handleCurrent(state);
        }
        else if (state.tree instanceof XPathParser.ParentContext){
            return handleParent(state);
        }
        else if (state.tree instanceof XPathParser.AttributeContext){
            return handleAttribute(state);
        }
        else if (state.tree instanceof XPathParser.TextFunctionContext){
            return handleTextFunction(state);
        }
        else if (state.tree instanceof XPathParser.InParenthesisContext) {
            return handleInParenthesis(state);
        }
        else if (state.tree instanceof XPathParser.FilterContext){
            return handleFilter(state);
        }
        else if (state.tree instanceof XPathParser.StringConstantTextContext){
            return handleStringConstantText(state);
        }
        else if (state.tree instanceof XPathParser.FContext) {
            return computeFilter(state);
        }


        return null;
    }

    private EvaluatorState handleAbsolutePath(EvaluatorState state) {
        String filename = state.tree.getChild(1).getText().replaceAll("\"", "");
        String absolutePath = BASE_FILE_PATH + filename;
        this.parser = new XMLParser(absolutePath);
        Node root = this.parser.root;
        if (state.tree.getChild(3).getText().equals("/")){
            state.tree = state.tree.getChild(4);
            state.path = "";
            state.dataNode = root;
            state.isRecursive = false;
            state.currentCandidates = Collections.singletonList(root);
           return compute(state);
        }
        else if (state.tree.getChild(3).getText().equals("//")){
            state.tree = state.tree.getChild(4);
            state.path = "";
            state.dataNode = root;
            state.isRecursive = true;
            state.currentCandidates = RelativePathFunctions.getAllChildren(root);
            return compute(state);
        }
        return null;
    }

    private EvaluatorState handleRelativePath(EvaluatorState state) {
        int childCount = state.tree.getChildCount();
        if (childCount == 1){
            state.tree = state.tree.getChild(0);
            state = compute(state);
        }
        else if (childCount == 2){
            EvaluatorState intermediateResult = new EvaluatorState(state);
            intermediateResult.tree = state.tree.getChild(0);
            intermediateResult = compute(intermediateResult);
            assert intermediateResult != null;
            intermediateResult.tree = state.tree.getChild(1);
            state = compute(intermediateResult);
        }
        else{
            EvaluatorState intermediateResult = new EvaluatorState(state);
            intermediateResult.tree = state.tree.getChild(0);
            intermediateResult = compute(intermediateResult);
            intermediateResult.isRecursive = state.tree.getChild(1).getText().equals("//");
            assert intermediateResult != null;
            if (state.tree.getChild(1).getText().equals(",")){
                EvaluatorState intermediateResult2 = new EvaluatorState(state);
                intermediateResult2.tree = state.tree.getChild(2);
                intermediateResult2 = compute(intermediateResult2);
                assert intermediateResult2 != null;
                state.currentCandidates = RelativePathFunctions.mergeLists(
                        intermediateResult.currentCandidates,
                        intermediateResult2.currentCandidates);
            }else{
                intermediateResult.tree = state.tree.getChild(2);
                state = compute(intermediateResult);
            }
        }
        return state;
    }

    public EvaluatorState handleTagName(EvaluatorState state) {
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

    public EvaluatorState handleChildren(EvaluatorState state) {
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

    public EvaluatorState handleCurrent(EvaluatorState state) {
        return state;
    }

    public EvaluatorState handleParent(EvaluatorState state) {
        if (!state.isRecursive){
            List<Node> result = new ArrayList<>();
            for (Node n : state.currentCandidates){
                result.addAll(RelativePathFunctions.getParent(n));
            }
            state.currentCandidates = result;
        }
        else{
            List<Node> result = new ArrayList<>();
            for (Node n : state.currentCandidates){
                result.addAll(RelativePathFunctions.getParent(n));
            }
            state.currentCandidates = result;
        }
        return state;
    }

    public EvaluatorState handleAttribute(EvaluatorState state) {
        String attrName = state.tree.getChild(2).getText();
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

    public EvaluatorState handleTextFunction(EvaluatorState state) {
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
    public EvaluatorState handleInParenthesis(EvaluatorState state) {
        state.tree = state.tree.getChild(1);
        return compute(state);
    }

    public EvaluatorState handleFilter(EvaluatorState state) {
        EvaluatorState intermediateResult = new EvaluatorState(state);
        intermediateResult.tree = state.tree.getChild(1);
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

    public EvaluatorState computeFilter(EvaluatorState state) {
        int childCount = state.tree.getChildCount();

        if (childCount == 1){
            List<Boolean> result = new ArrayList<>();
            for (int i = 0; i < state.currentCandidates.size(); i++){
                EvaluatorState intermediateResult = new EvaluatorState(state);
                intermediateResult.tree = state.tree.getChild(0);
                intermediateResult.currentCandidates = Collections.singletonList(state.currentCandidates.get(i));
                intermediateResult = compute(intermediateResult);
                assert intermediateResult != null;
                result.add(intermediateResult.filterMask.stream().anyMatch(x -> x));
            }
            state.filterMask = result;
            return state;
        } else if (childCount == 2) {
            if (state.tree.getChild(0).getText().equals("not")) {
                List<Boolean> result = new ArrayList<>();
                for (int i = 0; i < state.currentCandidates.size(); i++){
                    EvaluatorState intermediateResult = new EvaluatorState(state);
                    intermediateResult.tree = state.tree.getChild(1);
                    intermediateResult.currentCandidates = Collections.singletonList(state.currentCandidates.get(i));
                    intermediateResult = compute(intermediateResult);
                    assert intermediateResult != null;
                    result.add(intermediateResult.filterMask.stream().noneMatch(x -> x));
                }
                state.filterMask = result;
                return state;
            }
        }  else{
                if (state.tree.getChild(0).getText().equals("(") && state.tree.getChild(2).getText().equals(")")){
                    state.tree = state.tree.getChild(1);
                    return computeFilter(state);
                } else{
                    String operator = state.tree.getChild(1).getText();
                    List<Boolean> result = new ArrayList<>();
                    for (int i = 0; i < state.currentCandidates.size(); i++){
                        EvaluatorState intermediateResultLHS = new EvaluatorState(state);
                        intermediateResultLHS.tree = state.tree.getChild(0);
                        intermediateResultLHS.currentCandidates = Collections.singletonList(state.currentCandidates.get(i));
                        intermediateResultLHS = compute(intermediateResultLHS);
                        assert intermediateResultLHS != null;
                        EvaluatorState intermediateResultRHS = new EvaluatorState(state);
                        intermediateResultRHS.tree = state.tree.getChild(2);
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

    public EvaluatorState handleStringConstantText(EvaluatorState state) {
        String text = state.tree.getText().replaceAll("\"", "");
        List<Node> result = new ArrayList<>();
        for (Node n : state.currentCandidates){

                result.add(RelativePathFunctions.getTextNode(text, n));
        }
        state.currentCandidates = result;
        return state;
    }

}
