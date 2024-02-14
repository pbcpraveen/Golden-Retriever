
import evaluator.EvaluatorState;
import evaluator.QueryEvaluator;
import helper.CommonUtils;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Runner {
    public static void main(String[] args) {
        String queryFileName = args[0];
        String outputFileName = args[1];
        QueryEvaluator evaluator = new QueryEvaluator(queryFileName, true);
        EvaluatorState result = evaluator.evaluate();
        DocumentBuilder builder;
        try {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        CommonUtils.savetoXML(result.currentCandidates, builder, outputFileName);
    }
}
