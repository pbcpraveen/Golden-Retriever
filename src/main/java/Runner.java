
import parser_utils.*;
import org.w3c.dom.Node;
import evaluator.AbsolutePathFunctions;
import evaluator.CommonUtils;

import java.io.IOException;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        String queryFileName = args[0];
        String outputFileName = args[1];

        QueryEvaluator evaluator = new QueryEvaluator(queryFileName, true);
        EvaluatorState result = evaluator.evaluate();
        CommonUtils.savetoXML(result.currentCandidates, evaluator.parser.dBuilder, outputFileName);
    }
}
