package helperTests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import helper.FilterFunctions;

public class FilterFunctionTest {
    public static Document doc;
    @BeforeAll
    public static void setUp() {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
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
    public void testIsEqual1() {
        Node n1 = doc.createElement("test");
        Node child1_n1 = doc.createElement("child1");
        child1_n1.appendChild(doc.createTextNode("child1"));
        n1.appendChild(child1_n1);
        Node child2_n1 = doc.createElement("child2");
        child2_n1.appendChild(doc.createTextNode("child2"));
        n1.appendChild(child2_n1);

        Node n2 = doc.createElement("test");
        Node child1_n2 = doc.createElement("child2");
        child1_n2.appendChild(doc.createTextNode("child2"));
        n2.appendChild(child1_n2);
        Node child2_n2 = doc.createElement("child1");
        child2_n2.appendChild(doc.createTextNode("child1"));
        n2.appendChild(child2_n2);

        assert FilterFunctions.isValueEqual(n1, n2);
    }

    @Test
    public void testIsEqual2() {
        Node n1 = doc.createElement("test");
        Node child1_n1 = doc.createElement("child1");
        child1_n1.appendChild(doc.createTextNode("child1"));
        n1.appendChild(child1_n1);
        Node child2_n1 = doc.createElement("child2");
        child2_n1.appendChild(doc.createTextNode("different value"));
        n1.appendChild(child2_n1);

        Node n2 = doc.createElement("test");
        Node child1_n2 = doc.createElement("child2");
        child1_n2.appendChild(doc.createTextNode("child2"));
        n2.appendChild(child1_n2);
        Node child2_n2 = doc.createElement("child1");
        child2_n2.appendChild(doc.createTextNode("child1"));
        n2.appendChild(child2_n2);

        assert !FilterFunctions.isValueEqual(n1, n2);
    }

    @Test
    public void testIsEqual3() {
        Node n1 = doc.createElement("test");
        Node child1_n1 = doc.createElement("child1");
        child1_n1.appendChild(doc.createTextNode("child1"));
        n1.appendChild(child1_n1);

        Node n2 = doc.createElement("test");
        Node child1_n2 = doc.createElement("child2");
        child1_n2.appendChild(doc.createTextNode("child2"));
        n2.appendChild(child1_n2);
        Node child2_n2 = doc.createElement("child1");
        child2_n2.appendChild(doc.createTextNode("child1"));
        n2.appendChild(child2_n2);

        assert !FilterFunctions.isValueEqual(n1, n2);
    }

    @Test
    public void testIsEqual4() {
        Node n1 = doc.createElement("test");
        Node child1_n1 = doc.createElement("child1");
        child1_n1.appendChild(doc.createTextNode("child1"));
        n1.appendChild(child1_n1);
        Node child2_n1 = doc.createElement("child2");
        child2_n1.appendChild(doc.createTextNode("child2"));
        n1.appendChild(child2_n1);

        Node n2 = doc.createElement("test");
        Node child1_n2 = doc.createElement("child1");
        child1_n2.appendChild(doc.createTextNode("child1"));
        n2.appendChild(child1_n2);

        assert !FilterFunctions.isValueEqual(n1, n2);
    }

    @Test
    public void testIsEqual5() {
        Node n1 = doc.createElement("test");
        Node child1_n1 = doc.createElement("child1");
        child1_n1.appendChild(doc.createTextNode("child1"));
        n1.appendChild(child1_n1);
        Node child2_n1 = doc.createElement("child1");
        child2_n1.appendChild(doc.createTextNode("child1"));
        n1.appendChild(child2_n1);

        Node n2 = doc.createElement("test");
        Node child1_n2 = doc.createElement("child1");
        child1_n2.appendChild(doc.createTextNode("child1"));
        n2.appendChild(child1_n2);
        Node child2_n2 = doc.createElement("child2");
        child2_n2.appendChild(doc.createTextNode("child2"));
        n2.appendChild(child2_n2);

        assert !FilterFunctions.isValueEqual(n1, n2);
    }

    @Test
    public void testIsEqual6() {
        Node n1 = doc.createElement("test");
        Element child1_n1 = doc.createElement("child1");
        child1_n1.appendChild(doc.createTextNode("child1"));
        child1_n1.setAttribute("sample_attribute","sample_value");
        n1.appendChild(child1_n1);
        Node child2_n1 = doc.createElement("child2");
        child2_n1.appendChild(doc.createTextNode("child2"));
        n1.appendChild(child2_n1);

        Node n2 = doc.createElement("test");
        Node child1_n2 = doc.createElement("child1");
        child1_n2.appendChild(doc.createTextNode("child1"));
        n2.appendChild(child1_n2);
        Node child2_n2 = doc.createElement("child2");
        child2_n2.appendChild(doc.createTextNode("child2"));
        n2.appendChild(child2_n2);

        assert !FilterFunctions.isValueEqual(n1, n2);
    }

    @Test
    public void testIsIdentical(){
        Node n1 = doc.createElement("test");
        Node child1_n1 = doc.createElement("child1");
        child1_n1.appendChild(doc.createTextNode("child1"));
        n1.appendChild(child1_n1);
        Node child2_n1 = doc.createElement("child2");
        child2_n1.appendChild(doc.createTextNode("child2"));
        n1.appendChild(child2_n1);

        assert FilterFunctions.identical(n1, n1);
    }

    @Test
    public void testIsIdentical2(){
        Node n1 = doc.createElement("test");
        Node child1_n1 = doc.createElement("child1");
        child1_n1.appendChild(doc.createTextNode("child1"));
        n1.appendChild(child1_n1);
        Node child2_n1 = doc.createElement("child2");
        child2_n1.appendChild(doc.createTextNode("child2"));
        n1.appendChild(child2_n1);

        Node n2 = doc.createElement("test");
        Node child1_n2 = doc.createElement("child1");
        child1_n2.appendChild(doc.createTextNode("child1"));
        n2.appendChild(child1_n2);
        Node child2_n2 = doc.createElement("child2");
        child2_n2.appendChild(doc.createTextNode("child2"));
        n2.appendChild(child2_n2);

        assert !FilterFunctions.identical(n1, n2);
    }
}
