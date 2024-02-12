package evaluator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class CommonUtils {

    public static void savetoXML(List<Node> result, DocumentBuilder docBuilder, String resultFileName) {
        // create a new node called <result> and save it in a new XML file with name fileName

        try {
            Document newDoc = docBuilder.newDocument();
            Element rootElement = newDoc.createElement("result"); // Create a root element for the new document
            newDoc.appendChild(rootElement);
            for (Node n : result) {
                Node copiedNode = newDoc.importNode(n, true);
                rootElement.appendChild(copiedNode);
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(newDoc);
            StreamResult final_result = new StreamResult(new File(resultFileName));
            transformer.transform(source, final_result);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }

    }

    public static boolean isValidNode(Node node) {
        if (node instanceof Text) {
            String value = node.getNodeValue().trim();
            return !value.equals("");
        }
        return true;
    }
}
