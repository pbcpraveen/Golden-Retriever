package evaluator;

import helper.CommonUtils;
import org.w3c.dom.Node;

import java.util.Collections;
import java.util.List;

import static evaluator.QueryEvaluator.compute;

public class XqueryEvaluatorUtils {

    public static EvaluatorState handleXquery(EvaluatorState state) {
        EvaluatorState intermediateState = new EvaluatorState(state);
        int childCount = state.tree.getChildCount();
        if (childCount == 1) {
            intermediateState.tree = state.tree.getChild(0);
            return compute(intermediateState);
        } else {
            String separator = state.tree.getChild(1).getText();
            switch (separator) {
                case ",":
                    EvaluatorState left = new EvaluatorState(intermediateState);
                    left.tree = left.tree.getChild(0);
                    left = compute(left);
                    EvaluatorState right = new EvaluatorState(intermediateState);
                    right.tree = right.tree.getChild(2);
                    right = compute(right);
                    assert left != null;
                    List<Node> result = left.currentCandidates;
                    assert right != null;
                    result.addAll(right.currentCandidates);
                    intermediateState.currentCandidates = result;
                    return intermediateState;
                case "/":
                    EvaluatorState left1 = new EvaluatorState(intermediateState);
                    left1.tree = left1.tree.getChild(0);
                    left1 = compute(intermediateState);
                    EvaluatorState right1 = new EvaluatorState(intermediateState);
                    right1.tree = right1.tree.getChild(2);
                    assert left1 != null;
                    right1.currentCandidates = left1.currentCandidates;
                    right1 = compute(right1);
                    assert right1 != null;
                    intermediateState.currentCandidates = right1.currentCandidates;
                    return intermediateState;
                case "//":
                    EvaluatorState left2 = new EvaluatorState(intermediateState);
                    left2.tree = left2.tree.getChild(0);
                    left2 = compute(left2);
                    EvaluatorState right2 = new EvaluatorState(intermediateState);
                    right2.tree = right2.tree.getChild(2);
                    assert left2 != null;
                    right2.currentCandidates = left2.currentCandidates;
                    right2.isRecursive = true;
                    right2 = compute(right2);
                    assert right2 != null;
                    intermediateState.currentCandidates = right2.currentCandidates;
                    return intermediateState;
            }
        }
        return null;
    }

    public static EvaluatorState handleVariable(EvaluatorState state) {
        String variableName = state.tree.getText();
        if (state.context.containsKey(variableName)) {
            EvaluatorState newState = new EvaluatorState(state);
            newState.currentCandidates = state.context.get(variableName);
            return newState;
        }
        else {
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
        newState.tree = state.tree.getChild(1);
        return compute(newState);
    }

    public static EvaluatorState handleNewTag(EvaluatorState state) {
        return state;
    }

    public static EvaluatorState handleForBody(EvaluatorState state) {
        return state;
    }

    public static EvaluatorState handleLetClause(EvaluatorState state) {
        return state;
    }

}


