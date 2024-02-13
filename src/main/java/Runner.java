
import evaluator.EvaluatorState;
import evaluator.QueryEvaluator;
import helper.CommonUtils;

public class Runner {
    public static void main(String[] args) {
        String queryFileName = args[0];
        String outputFileName = args[1];
        QueryEvaluator evaluator = new QueryEvaluator(queryFileName, true);
        EvaluatorState result = evaluator.evaluate();
        CommonUtils.savetoXML(result.currentCandidates, evaluator.parser.dBuilder, outputFileName);
    }
}
