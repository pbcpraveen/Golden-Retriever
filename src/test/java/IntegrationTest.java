import helper.FilterFunctions;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;
import helper.XMLParser;

public class IntegrationTest {

    @Test
    public void testQuery1(){
        String queryFileName = "src/main/resources/query/query1.txt";
        String outputFileName = "src/main/resources/test/results/result1.xml";
        Runner.main(new String[]{queryFileName, outputFileName});
        Node xml1 = new XMLParser("src/main/resources/test/results/result1.xml").root;
        Node xml2 = new XMLParser("src/main/resources/results/result1.xml").root;

        assert  FilterFunctions.isValueEqual(xml1, xml2);
    }

    @Test
    public void testQuery2(){
        String queryFileName = "src/main/resources/query/query2.txt";
        String outputFileName = "src/main/resources/test/results/result2.xml";
        Runner.main(new String[]{queryFileName, outputFileName});
        Node xml1 = new XMLParser("src/main/resources/test/results/result2.xml").root;
        Node xml2 = new XMLParser("src/main/resources/results/result2.xml").root;

        assert  FilterFunctions.isValueEqual(xml1, xml2);
    }

    @Test
    public void testQuery3(){
        String queryFileName = "src/main/resources/query/query3.txt";
        String outputFileName = "src/main/resources/test/results/result3.xml";
        Runner.main(new String[]{queryFileName, outputFileName});
        Node xml1 = new XMLParser("src/main/resources/test/results/result3.xml").root;
        Node xml2 = new XMLParser("src/main/resources/results/result3.xml").root;

        assert  FilterFunctions.isValueEqual(xml1, xml2);
    }

    @Test
    public void testQuery4(){
        String queryFileName = "src/main/resources/query/query4.txt";
        String outputFileName = "src/main/resources/test/results/result4.xml";
        Runner.main(new String[]{queryFileName, outputFileName});
        Node xml1 = new XMLParser("src/main/resources/test/results/result4.xml").root;
        Node xml2 = new XMLParser("src/main/resources/results/result4.xml").root;

        assert  FilterFunctions.isValueEqual(xml1, xml2);
    }

    @Test
    public void testQuery5(){
        String queryFileName = "src/main/resources/query/query5.txt";
        String outputFileName = "src/main/resources/test/results/result5.xml";
        Runner.main(new String[]{queryFileName, outputFileName});
        Node xml1 = new XMLParser("src/main/resources/test/results/result5.xml").root;
        Node xml2 = new XMLParser("src/main/resources/results/result5.xml").root;

        assert  FilterFunctions.isValueEqual(xml1, xml2);
    }

    @Test
    public void testQuery6(){
        String queryFileName = "src/main/resources/query/query6.txt";
        String outputFileName = "src/main/resources/test/results/result6.xml";
        Runner.main(new String[]{queryFileName, outputFileName});
        Node xml1 = new XMLParser("src/main/resources/test/results/result6.xml").root;
        Node xml2 = new XMLParser("src/main/resources/results/result6.xml").root;

        assert  FilterFunctions.isValueEqual(xml1, xml2);
    }

    @Test
    public void testQuery7(){
        String queryFileName = "src/main/resources/query/query7.txt";
        String outputFileName = "src/main/resources/test/results/result7.xml";
        Runner.main(new String[]{queryFileName, outputFileName});
        Node xml1 = new XMLParser("src/main/resources/test/results/result7.xml").root;
        Node xml2 = new XMLParser("src/main/resources/results/result7.xml").root;

        assert  FilterFunctions.isValueEqual(xml1, xml2);
    }

    @Test
    public void testQuery8(){
        String queryFileName = "src/main/resources/query/query8.txt";
        String outputFileName = "src/main/resources/test/results/result8.xml";
        Runner.main(new String[]{queryFileName, outputFileName});
        Node xml1 = new XMLParser("src/main/resources/test/results/result8.xml").root;
        Node xml2 = new XMLParser("src/main/resources/results/result8.xml").root;

        assert  FilterFunctions.isValueEqual(xml1, xml2);
    }

    @Test
    public void testQuery9(){
        String queryFileName = "src/main/resources/query/query9.txt";
        String outputFileName = "src/main/resources/test/results/result9.xml";
        Runner.main(new String[]{queryFileName, outputFileName});
        Node xml1 = new XMLParser("src/main/resources/test/results/result9.xml").root;
        Node xml2 = new XMLParser("src/main/resources/results/result9.xml").root;

        assert  FilterFunctions.isValueEqual(xml1, xml2);
    }

    @Test
    public void testQuery10(){
        String queryFileName = "src/main/resources/query/query10.txt";
        String outputFileName = "src/main/resources/test/results/result10.xml";
        Runner.main(new String[]{queryFileName, outputFileName});
        Node xml1 = new XMLParser("src/main/resources/test/results/result10.xml").root;
        Node xml2 = new XMLParser("src/main/resources/results/result10.xml").root;

        assert  FilterFunctions.isValueEqual(xml1, xml2);
    }
}
