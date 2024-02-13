package helperTests;

import helper.CommonUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class CommonUtilsTest {

    static Document doc;

    @BeforeAll
    public static void setUp() {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.newDocument();
            Element rootElement = doc.createElement("root");
            doc.appendChild(rootElement);
            Node node = doc.createElement("sample");
            rootElement.appendChild(node);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testIsValidNodeNull() {
        assert !CommonUtils.isValidNode(null);
    }

    @Test
    public void testIsValidNodeText() {
        Node node  = doc.createTextNode("");
        assert !CommonUtils.isValidNode(node);
    }

}
