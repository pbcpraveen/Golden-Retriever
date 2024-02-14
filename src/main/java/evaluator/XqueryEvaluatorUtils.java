package evaluator;

import static evaluator.QueryEvaluator.compute;

public class XqueryEvaluatorUtils {
    public static EvaluatorState handleXquery(EvaluatorState state) {
        EvaluatorState intermediateState = new EvaluatorState(state);
        intermediateState.tree = intermediateState.tree.getChild(0);
        return compute(intermediateState);
    }
}
