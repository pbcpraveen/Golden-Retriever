import helper.FilterFunctions;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;
import helper.XMLParser;

import java.util.List;

public class IntegrationTest {

    static String expectedResultsPath = "src/test/resources/expected/";
    static String testResultsPath = "src/test/resources/results/";
    static String testQueryPath = "src/test/resources/query/";
    static List<String> queryNames = List.of("query1", "query2", "query3", "query4", "query5", "query6", "query7", "query8", "query9", "query10", "query11", "query12");
    static List<String> resultNames = List.of("result1", "result2", "result3", "result4", "result5", "result6", "result7", "result8", "result9", "result10", "result11", "result12");

    private static boolean runAndCompare(int index){
        String queryFileName = testQueryPath + queryNames.get(index) + ".txt";
        String outputFileName = testResultsPath + resultNames.get(index) + ".xml";
        String expectedFileName = expectedResultsPath + resultNames.get(index) + ".xml";
        Runner.main(new String[]{queryFileName, outputFileName});
        Node xml1 = new XMLParser(outputFileName).root;
        Node xml2 = new XMLParser(expectedFileName).root;

        return FilterFunctions.isValueEqual(xml1, xml2);
    }
    @Test
    public void testQuery1(){
        assert runAndCompare(0);
    }

    @Test
    public void testQuery2(){
        assert runAndCompare(1);
    }

    @Test
    public void testQuery3(){
        assert runAndCompare(2);
    }

    @Test
    public void testQuery4(){
        assert runAndCompare(3);
    }

    @Test
    public void testQuery5(){
        assert runAndCompare(4);
    }

    @Test
    public void testQuery6(){
        assert runAndCompare(5);
    }

    @Test
    public void testQuery7(){
        assert runAndCompare(6);
    }

    @Test
    public void testQuery8(){
        assert runAndCompare(7);
    }

    @Test
    public void testQuery9(){
        assert runAndCompare(8);
    }

    @Test
    public void testQuery10(){
        assert runAndCompare(9);
    }

    @Test
    public void testQuery11(){ assert runAndCompare(10); }

    @Test
    public void testQuery12(){ assert runAndCompare(11); }
}
