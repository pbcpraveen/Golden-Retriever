package helper;

import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static helper.FilterFunctions.identical;
import static helper.FilterFunctions.isValueEqual;

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
        if (node == null) return false;
        if (node instanceof Text) {
            String value = node.getNodeValue().trim();
            return !value.equals("");
        }
        return true;
    }

    public static String readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        if (!file.exists()) {
            throw new RuntimeException("File not found: " + path);
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder result = new StringBuilder();
        try {
            String line;
            while ( (line = reader.readLine() ) != null)
                result.append(line.trim());
            return result.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Node createTextNode(String text) {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            return doc.createTextNode(text);
        } catch (ParserConfigurationException e) {
            return null;
        }
    }

    public static Node createNode(String nodeName, List<Node> children) {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            Element node = doc.createElement(nodeName);
            for (Node child : children) {
                Node copiedNode = doc.importNode(child, true);
                node.appendChild(copiedNode);
            }
            return node;
        } catch (ParserConfigurationException e) {
            return null;
        }
    }

    public static ParseTree getValidChild(ParseTree tree, int index) {
        int validChildCount = 0;
        for (int i = 0; i < tree.getChildCount(); i++) {
            if (tree.getChild(i).getText().trim().length() > 0) {
                if (validChildCount == index) {
                    return tree.getChild(i);
                }
                validChildCount++;
            }
        }
        return tree;
    }

    public static int getValidChildCount(ParseTree tree) {
        int validChildCount = 0;
        for (int i = 0; i < tree.getChildCount(); i++) {
            if (tree.getChild(i).getText().trim().length() > 0) {
                validChildCount++;
            }
        }
        return validChildCount;
    }

    public static List<Node> getUniqueNodes(List<Node> nodes) {
        List<Node> uniqueList = new ArrayList<>();

        outerLoop:
        for (Node current : nodes) {
            for (Node unique : uniqueList) {
                if (identical(current, unique)) {
                    continue outerLoop;
                }
            }
            uniqueList.add(current);
        }

        return uniqueList;
    }

    public static List<Node> getUniqueValueNodes(List<Node> nodes) {
        List<Node> uniqueList = new ArrayList<>();

        outerLoop:
        for (Node current : nodes) {
            for (Node unique : uniqueList) {
                if (isValueEqual(current, unique)) {
                    continue outerLoop;
                }
            }
            uniqueList.add(current);
        }

        return uniqueList;
    }

    public static void saveToFile(String content, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
