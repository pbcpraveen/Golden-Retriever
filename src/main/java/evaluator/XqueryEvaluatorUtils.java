package evaluator;

import helper.CommonUtils;
import helper.FilterFunctions;
import helper.RelativePathFunctions;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;
import parser_util.XQueryParser;

import javax.xml.parsers.DocumentBuilder;
import java.util.*;
import java.util.stream.Collectors;

import static evaluator.QueryEvaluator.compute;
import static helper.CommonUtils.getValidChild;
import static helper.CommonUtils.getValidChildCount;

public class XqueryEvaluatorUtils {

    public static EvaluatorState handleXquery(EvaluatorState state) {
        EvaluatorState intermediateState = new EvaluatorState(state);
        int childCount = getValidChildCount(state.tree);
        if (childCount == 1) {
            intermediateState.tree = getValidChild(state.tree, 0);
            return compute(intermediateState);
        } else {
            String separator = getValidChild(state.tree, 1).getText();
            switch (separator) {
                case ",":
                    EvaluatorState left = new EvaluatorState(intermediateState);
                    left.tree = getValidChild(left.tree, 0);
                    left = compute(left);
                    EvaluatorState right = new EvaluatorState(intermediateState);
                    right.tree = getValidChild(right.tree, 2);
                    right = compute(right);
                    assert left != null;
                    List<Node> result = new ArrayList<>(left.currentCandidates);
                    assert right != null;
                    result.addAll(right.currentCandidates);
                    intermediateState.currentCandidates = result;
                    return intermediateState;
                case "/":
                    EvaluatorState left1 = new EvaluatorState(intermediateState);
                    left1.tree = getValidChild(left1.tree, 0);
                    left1 = compute(left1);
                    EvaluatorState right1 = new EvaluatorState(intermediateState);
                    right1.tree = getValidChild(right1.tree, 2);
                    assert left1 != null;
                    right1.currentCandidates = CommonUtils.getUniqueNodes(new ArrayList<>(left1.currentCandidates));
                    right1 = compute(right1);
                    assert right1 != null;
                    // get unique nodes
                    intermediateState.currentCandidates = CommonUtils.getUniqueNodes(right1.currentCandidates);
                    return intermediateState;
                case "//":
                    EvaluatorState left2 = new EvaluatorState(intermediateState);
                    left2.tree = getValidChild(left2.tree, 0);
                    left2 = compute(left2);
                    EvaluatorState right2 = new EvaluatorState(intermediateState);
                    right2.tree = getValidChild(right2.tree, 2);
                    assert left2 != null;
                    right2.currentCandidates = CommonUtils.getUniqueNodes(new ArrayList<>(left2.currentCandidates));
                    right2.isRecursive = true;
                    right2 = compute(right2);
                    assert right2 != null;
                    // get unique nodes
                    intermediateState.currentCandidates = CommonUtils.getUniqueNodes(right2.currentCandidates);
                    return intermediateState;
                default:
                    throw new RuntimeException("Separator " + separator + " not supported");
            }
        }
    }

    public static EvaluatorState handleVariable(EvaluatorState state) {
        String variableName = state.tree.getText();
        if (state.context.containsKey(variableName)) {
            EvaluatorState newState = new EvaluatorState(state);
            newState.currentCandidates = state.context.get(variableName);
            return newState;
        } else {
            throw new RuntimeException("Variable " + variableName + " not found");
        }
    }

    public static EvaluatorState handleStringConstant(EvaluatorState state) {
        EvaluatorState newState = new EvaluatorState(state);
        String constant = state.tree.getText().replaceAll("\"", "");
        Node textNode = CommonUtils.createTextNode(constant);
        newState.currentCandidates = Collections.singletonList(textNode);
        return newState;
    }

    public static EvaluatorState handleXqueryInParenthesis(EvaluatorState state) {
        EvaluatorState newState = new EvaluatorState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState = compute(newState);
        state.currentCandidates = compute(newState).currentCandidates;
        return state;
    }

    public static EvaluatorState handleNewTag(EvaluatorState state) {
        String tagName = getValidChild(state.tree, 0).getText().replaceAll("<", "").replaceAll(">", "");
        EvaluatorState newState = new EvaluatorState(state);
        newState.tree = getValidChild(state.tree, 2);
        newState = compute(newState);
        assert newState != null;
        Node node = CommonUtils.createNode(tagName, newState.currentCandidates);
        state.currentCandidates = Collections.singletonList(node);
        return state;
    }

    public static EvaluatorState handleForBody(EvaluatorState state) {
        EvaluatorState newState = new EvaluatorState(state);
        int childCount = getValidChildCount(newState.tree);
        ParseTree forClauseTree = getValidChild(newState.tree, 0);
        for (int i = 1; i < childCount - 1; i++) {
            if (getValidChild(newState.tree, i) instanceof XQueryParser.LetClauseContext) {
                newState.forBodyComponents.put("let", getValidChild(newState.tree, i));
            } else {
                newState.forBodyComponents.put("where", getValidChild(newState.tree, i));
            }
        }
        newState.forBodyComponents.put("return", getValidChild(newState.tree, childCount - 1));
        newState.tree = forClauseTree;
        newState = compute(newState);
        assert newState != null;
        state.currentCandidates = newState.currentCandidates;
        return state;
    }

    public static EvaluatorState handleLetClause(EvaluatorState state) {
        int childCount = getValidChildCount(state.tree);
        if (childCount > 0) {
            EvaluatorState newState = new EvaluatorState(state);
            newState.tree = getValidChild(newState.tree, 1);
            newState = compute(newState);
            assert newState != null;
            state.context = newState.context;
            return state;
        } else {
            return state;
        }
    }

    public static EvaluatorState handleForClause(EvaluatorState state) {
        EvaluatorState newState = new EvaluatorState(state);
        newState.tree = getValidChild(newState.tree, 1);
        newState = compute(newState);
        assert newState != null;
        state.currentCandidates = newState.currentCandidates;
        return state;
    }

    public static EvaluatorState handleForVariable(EvaluatorState state) {
        EvaluatorState newState = new EvaluatorState(state);
        int childCount = getValidChildCount(newState.tree);
        if (childCount == 1) {
            String variableName = getValidChild(getValidChild(newState.tree, 0), 0).getText();
            newState.tree = getValidChild(getValidChild(newState.tree, 0), 2);
            newState.forBodyComponents = new HashMap<>();
            newState = compute(newState);
            assert newState != null;
            List<Node> nodes = newState.currentCandidates;
            List<Node> result = new ArrayList<>();
            boolean someCondition = false;
            for (Node node : nodes) {
                EvaluatorState loopState = new EvaluatorState(state);
                loopState.context.put(variableName, Collections.singletonList(node));
                if (state.forBodyComponents.containsKey("let")) {
                    EvaluatorState letState = new EvaluatorState(loopState);
                    letState.tree = state.forBodyComponents.get("let");
                    letState = compute(letState);
                    assert letState != null;
                    loopState.context = letState.context;
                }
                if (state.forBodyComponents.containsKey("where")) {
                    EvaluatorState whereState = new EvaluatorState(loopState);
                    whereState.tree = state.forBodyComponents.get("where");
                    whereState = compute(whereState);
                    assert whereState != null;
                    if (!whereState.whereClauseDecision) {
                        continue;
                    }
                }
                if (state.forBodyComponents.containsKey("return")) {
                    EvaluatorState returnState = new EvaluatorState(loopState);
                    returnState.tree = state.forBodyComponents.get("return");
                    returnState = compute(returnState);
                    assert returnState != null;
                    result.addAll(returnState.currentCandidates);
                }
                if (state.forBodyComponents.containsKey("cond")) {
                    EvaluatorState condState = new EvaluatorState(loopState);
                    condState.tree = state.forBodyComponents.get("cond");
                    condState = compute(condState);
                    assert condState != null;
                    someCondition = someCondition || condState.whereClauseDecision;
                }
            }
            state.whereClauseDecision = someCondition;
            state.currentCandidates = result;
            return state;
        } else {
            String variable1 = getValidChild(getValidChild(newState.tree, 0), 0).getText();
            EvaluatorState left = new EvaluatorState(newState);
            left.tree = getValidChild(getValidChild(newState.tree, 0), 2);
            left.forBodyComponents = new HashMap<>();
            left = compute(left);
            assert left != null;
            List<Node> nodes = left.currentCandidates;
            List<Node> result = new ArrayList<>();
            boolean someCondition = false;
            for (Node node : nodes) {
                EvaluatorState loopState = new EvaluatorState(state);
                loopState.context.put(variable1, Collections.singletonList(node));
                loopState.tree = getValidChild(state.tree, 1);
                loopState = compute(loopState);
                assert loopState != null;
                result.addAll(loopState.currentCandidates);
                someCondition = someCondition || loopState.whereClauseDecision;
            }
            state.currentCandidates = result;
            state.whereClauseDecision = someCondition;
            return state;
        }
    }

    public static EvaluatorState handleMoreForVariables(EvaluatorState state) {
        EvaluatorState newState = new EvaluatorState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState = compute(newState);
        assert newState != null;
        state.currentCandidates = newState.currentCandidates;
        return state;
    }

    public static EvaluatorState handleWhereClause(EvaluatorState state) {
        ParseTree condition = getValidChild(state.tree, 1);
        EvaluatorState newState = new EvaluatorState(state);
        newState.tree = condition;
        newState.forBodyComponents = new HashMap<>();
        newState = compute(newState);
        assert newState != null;
        state.whereClauseDecision = newState.whereClauseDecision;
        return state;
    }

    public static EvaluatorState handleLoopVariableAssignment(EvaluatorState state) {
        String variableName = getValidChild(state.tree, 0).getText();
        EvaluatorState newState = new EvaluatorState(state);
        newState.tree = getValidChild(state.tree, 2);
        newState = compute(newState);
        assert newState != null;
        state.context.put(variableName, newState.currentCandidates);
        state.currentCandidates = newState.currentCandidates;
        return state;
    }

    public static EvaluatorState handleLetVariables(EvaluatorState state) {
        EvaluatorState newState = new EvaluatorState(state);
        int childCount = getValidChildCount(newState.tree);
        newState.forBodyComponents = new HashMap<>();

        newState.tree = getValidChild(newState.tree, 0);
        newState = compute(newState);
        assert newState != null;
        state.context = newState.context;
        if (childCount == 1) {
            return state;
        } else {
            newState = new EvaluatorState(state);
            newState.tree = getValidChild(state.tree, 1);
            newState = compute(newState);
            assert newState != null;
            state.context = newState.context;
            return state;
        }
    }

    public static EvaluatorState handleMoreLetVariables(EvaluatorState state) {
        EvaluatorState newState = new EvaluatorState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState = compute(newState);
        assert newState != null;
        state.context = newState.context;
        return state;
    }

    public static EvaluatorState handleLetVariableAssignment(EvaluatorState state) {

        EvaluatorState newState = new EvaluatorState(state);
        String variableName = getValidChild(newState.tree, 0).getText();
        newState.tree = getValidChild(newState.tree, 2);
        newState = compute(newState);
        assert newState != null;
        state.context.put(variableName, newState.currentCandidates);
        return state;
    }

    public static EvaluatorState handleCond(EvaluatorState state) {
        int childCount = getValidChildCount(state.tree);
        if (childCount == 1) {
            EvaluatorState newState = new EvaluatorState(state);
            newState.tree = getValidChild(state.tree, 0);
            newState = compute(newState);
            assert newState != null;
            state.whereClauseDecision = newState.whereClauseDecision;
            return state;
        } else {
            EvaluatorState left = new EvaluatorState(state);
            left.tree = getValidChild(state.tree, 0);
            left = compute(left);
            assert left != null;
            EvaluatorState right = new EvaluatorState(state);
            right.tree = getValidChild(state.tree, 2);
            right = compute(right);
            assert right != null;
            if (getValidChild(state.tree, 1).getText().equals("and")) {
                state.whereClauseDecision = left.whereClauseDecision && right.whereClauseDecision;
            } else {
                state.whereClauseDecision = left.whereClauseDecision || right.whereClauseDecision;
            }
            return state;
        }
    }

    public static EvaluatorState handleEmptyCondition(EvaluatorState state) {
        EvaluatorState newState = new EvaluatorState(state);
        newState.tree = getValidChild(state.tree, 2);
        newState = compute(newState);
        assert newState != null;
        state.whereClauseDecision = newState.currentCandidates.size() == 0;
        return state;
    }

    public static EvaluatorState handleNotCondition(EvaluatorState state) {
        EvaluatorState newState = new EvaluatorState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState = compute(newState);
        assert newState != null;
        state.whereClauseDecision = !newState.whereClauseDecision;
        return state;
    }

    public static EvaluatorState handleParenthesisCondition(EvaluatorState state) {
        EvaluatorState newState = new EvaluatorState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState = compute(newState);
        assert newState != null;
        state.whereClauseDecision = newState.whereClauseDecision;
        return state;
    }

    public static EvaluatorState handleSomeVarCondition(EvaluatorState state) {
        EvaluatorState newState = new EvaluatorState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState.forBodyComponents = new HashMap<>();
        newState.forBodyComponents.put("cond", getValidChild(state.tree, 3));
        newState = compute(newState);
        assert newState != null;
        state.whereClauseDecision = newState.whereClauseDecision;
        return state;
    }

    public static EvaluatorState handleEqualityCondition(EvaluatorState state) {
        EvaluatorState left = new EvaluatorState(state);
        left.tree = getValidChild(state.tree, 0);
        left = compute(left);
        assert left != null;
        EvaluatorState right = new EvaluatorState(state);
        right.tree = getValidChild(state.tree, 2);
        right = compute(right);
        assert right != null;
        boolean result = false;
        for (Node leftNode : left.currentCandidates) {
            for (Node rightNode : right.currentCandidates) {
                if (FilterFunctions.isValueEqual(leftNode, rightNode)) {
                    result = true;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        state.whereClauseDecision = result;
        return state;
    }

    public static EvaluatorState handleIdentityCondition(EvaluatorState state) {
        EvaluatorState left = new EvaluatorState(state);
        left.tree = getValidChild(state.tree, 0);
        left = compute(left);
        assert left != null;
        EvaluatorState right = new EvaluatorState(state);
        right.tree = getValidChild(state.tree, 2);
        right = compute(right);
        assert right != null;
        boolean result = false;
        for (Node leftNode : left.currentCandidates) {
            for (Node rightNode : right.currentCandidates) {
                if (FilterFunctions.identical(leftNode, rightNode)) {
                    result = true;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        state.whereClauseDecision = result;
        return state;
    }

    public static EvaluatorState handleReturnClause(EvaluatorState state) {
        EvaluatorState newState = new EvaluatorState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState.forBodyComponents = new HashMap<>();
        newState = compute(newState);
        assert newState != null;
        state.currentCandidates = newState.currentCandidates;
        return state;
    }

    public static EvaluatorState handleLetClauseWithXquery(EvaluatorState state) {
        EvaluatorState newState = new EvaluatorState(state);
        newState.tree = getValidChild(state.tree, 0);
        newState = compute(newState);
        assert newState != null;
        EvaluatorState computedState = new EvaluatorState(state);
        computedState.context = newState.context;
        computedState.tree = getValidChild(state.tree, 1);
        computedState = compute(computedState);
        state.currentCandidates = computedState.currentCandidates;
        return state;
    }

    public static String getStringValueOfTag(Node node, String tagName) {
        List<Node> nodes = RelativePathFunctions.relativePath(node, tagName);
        if (nodes.size() == 0) {
            return "";
        }
        return nodes.get(0).getTextContent();
    }

    public static boolean isNodeMatch(Node left, Node right, List<String> leftConditions, List<String> rightConditions,
                                      HashMap<String, String> leftConditionsValues, HashMap<String, String> rightConditionsValues) {
        for (int i = 0; i < leftConditions.size(); i++) {
            String leftValue = leftConditionsValues.get(leftConditions.get(i));
            String rightValue = rightConditionsValues.get(rightConditions.get(i));
            if (!leftValue.equals(rightValue)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNodeGreaterThan(Node left, Node right, String leftCondition, String rightCondition) {
        String leftValue = getStringValueOfTag(left, leftCondition);
        String rightValue = getStringValueOfTag(right, rightCondition);
        return leftValue.compareTo(rightValue) > 0;

    }

    public static EvaluatorState handleJoin(EvaluatorState state) {
        long startTime = System.currentTimeMillis();
        EvaluatorState left = new EvaluatorState(state);
        left.tree = getValidChild(state.tree, 2);
        left = compute(left);
        assert left != null;
        EvaluatorState right = new EvaluatorState(state);
        right.tree = getValidChild(state.tree, 4);
        right = compute(right);
        assert right != null;
        boolean isCartesian = false;
        String cond1 = getValidChild(state.tree, 6).getText();
        String cond2 = getValidChild(state.tree, 8).getText();
        cond1 = cond1.replace("[", "").replace("]", "").trim();
        cond2 = cond2.replace("[", "").replace("]", "").trim();
        if (cond1.length() == 0 && cond2.length() == 0) {
            isCartesian = true;
        }

        if (isCartesian) {
            List<Node> result = new ArrayList<>();
            for (Node leftNode : left.currentCandidates) {
                for (Node rightNode : right.currentCandidates) {
                    List<Node> newNodes = new ArrayList<>();
                    for (int i = 0; i < leftNode.getChildNodes().getLength(); i++) {
                        newNodes.add(leftNode.getChildNodes().item(i));
                    }
                    for (int i = 0; i < rightNode.getChildNodes().getLength(); i++) {
                        newNodes.add(rightNode.getChildNodes().item(i));
                    }
                    Node newNode = CommonUtils.createNode("tuple", newNodes);
                    result.add(newNode);
                }
            }
            state.currentCandidates = result;
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken perform join: " + (endTime - startTime) + "ms");
            return state;
        } else {
            String leftCond = cond1.split(",")[0].strip();
            String rightCond = cond2.split(",")[0].strip();

            // sort the nodes
            List<Node> leftNodes = new ArrayList<>(left.currentCandidates);
            List<Node> rightNodes = new ArrayList<>(right.currentCandidates);


            leftNodes.sort(Comparator.comparing(o -> getStringValueOfTag(o, leftCond)));
            rightNodes.sort(Comparator.comparing(o -> getStringValueOfTag(o, rightCond)));


            int leftPointer = 0;
            int rightPointer = 0;
            List<Node> result = new ArrayList<>();

            List<String> leftConditions = Arrays.stream(cond1.split(",")).map(String::strip).collect(Collectors.toList());
            List<String> rightConditions = Arrays.stream(cond2.split(",")).map(String::strip).collect(Collectors.toList());

            HashMap<Integer, HashMap<String, String>> joinValueLookUpLeft = new HashMap<>();
            HashMap<Integer, HashMap<String, String>> joinValueLookUpRight = new HashMap<>();
            for(int r = 0; r<rightNodes.size(); r++){
                HashMap<String, String> temp = new HashMap<>();
                for(String condition: rightConditions){
                    temp.put(condition, getStringValueOfTag(rightNodes.get(r), condition));
                }
                joinValueLookUpRight.put(r, temp);
            }

            for (int l=0; l< leftNodes.size(); l++){
                HashMap<String, String> temp = new HashMap<>();
                for (String condition: leftConditions){
                    temp.put(condition, getStringValueOfTag(leftNodes.get(l), condition));
                }
                joinValueLookUpLeft.put(l, temp);
            }

            while (leftPointer < leftNodes.size() && rightPointer < rightNodes.size()) {
                int tempRightPointer = rightPointer;
                while (tempRightPointer < rightNodes.size() &&
                        isNodeMatch(leftNodes.get(leftPointer), rightNodes.get(tempRightPointer), leftConditions, rightConditions, joinValueLookUpLeft.get(leftPointer), joinValueLookUpRight.get(rightPointer))) {
                    List<Node> newNodes = new ArrayList<>();
                    for (int i = 0; i < leftNodes.get(leftPointer).getChildNodes().getLength(); i++) {
                        newNodes.add(leftNodes.get(leftPointer).getChildNodes().item(i));
                    }
                    for (int i = 0; i < rightNodes.get(tempRightPointer).getChildNodes().getLength(); i++) {
                        newNodes.add(rightNodes.get(tempRightPointer).getChildNodes().item(i));
                    }
                    Node newNode = CommonUtils.createNode("tuple", newNodes);
                    result.add(newNode);
                    tempRightPointer++;
                }
                leftPointer++;
                if(leftPointer < leftNodes.size() && rightPointer < rightNodes.size() &&
                        !isNodeMatch(leftNodes.get(leftPointer), rightNodes.get(rightPointer), leftConditions, rightConditions, joinValueLookUpLeft.get(leftPointer), joinValueLookUpRight.get(rightPointer))) {
                    rightPointer = tempRightPointer;
                }
            }
            state.currentCandidates = result;
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken perform join: " + (endTime - startTime) + "ms");
            return state;
        }
    }
}


