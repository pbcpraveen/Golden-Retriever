
import evaluator.EvaluatorState;
import evaluator.QueryEvaluator;
import helper.CommonUtils;
import optimizer.Optimizer;
import optimizer.OptimizerState;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import static optimizer.Optimizer.optimize;

public class Runner {
    public static void main(String[] args) {
        String queryFileName = args[0];
        String outputFileName = args[1];
        boolean doOptimize = false;
        if (args.length == 3){
            doOptimize = Boolean.parseBoolean(args[2]);
        }
        if (doOptimize){
            Optimizer optimizer = new Optimizer(queryFileName);
            String optimizedQuery = optimize(optimizer.state).optimizedQuery;
            // save to file
            String optimizedQueryFileName = queryFileName.replace(".txt", "_optimized.txt");
            CommonUtils.saveToFile(optimizedQuery, optimizedQueryFileName);
            queryFileName = optimizedQueryFileName;
        }
        QueryEvaluator evaluator = new QueryEvaluator(queryFileName, true);
        //calculate time of evaluation
        long startTime = System.currentTimeMillis();
        EvaluatorState result = evaluator.evaluate();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
        DocumentBuilder builder;
        try {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        CommonUtils.savetoXML(result.currentCandidates, builder, outputFileName);
    }
}
