package helper;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilterFunctions {

    public static boolean notEmpty(List<Node> nodes) {
        return !nodes.isEmpty();
    }

    private static NodeList removeNode(NodeList list, Node node) {
        NodeList result = list;
        for (int i = 0; i < list.getLength(); i++) {
            if (list.item(i).equals(node)) {
                result = list;
                break;
            }
        }
        return result;
    }

    public static boolean isValueEqual(Node n1, Node n2) {
        // first check if tag names are equal
        if (!n1.getNodeName().equals(n2.getNodeName())) {
            return false;
        }
        // then check if the values are equal
        if (n1.getNodeType() == Node.TEXT_NODE && n2.getNodeType() == Node.TEXT_NODE) {
            return n1.getNodeValue().equals(n2.getNodeValue());
        }
        if (n1.getNodeType() != n2.getNodeType())
            return false;

        NamedNodeMap n1_attr = n1.getAttributes();
        NamedNodeMap n2_attr = n2.getAttributes();
        if (n1_attr != null && n2_attr != null) {
            if (n1_attr.getLength() != n2_attr.getLength())
                return false;
            for (int i = 0; i < n1_attr.getLength(); i++) {
                Node attr1 = n1_attr.item(i);
                Node attr2 = n2_attr.getNamedItem(attr1.getNodeName());
                if (attr2 == null || !attr1.getNodeValue().equals(attr2.getNodeValue()))
                    return false;
            }
        }
        NodeList children1 = n1.getChildNodes();
        NodeList children2 = n2.getChildNodes();
        if (children1.getLength() != children2.getLength())
            return false;
        Set<Node> matched_set = new HashSet<>();
        for (int i = 0; i < children1.getLength(); i++) {
            boolean match_found = false;
            for (int j = 0; j < children2.getLength(); j++) {
                if (!matched_set.contains(children2.item(j)) && isValueEqual(children1.item(i), children2.item(j))) {
                    match_found = true;
                    matched_set.add(children2.item(j));
                    break;
                }
            }
            if (!match_found)
                return false;
        }
        return true;
    }

    public static boolean identical(Node n1, Node n2)
    {
        if (n1.getNodeType() == Node.TEXT_NODE && n2.getNodeType() == Node.TEXT_NODE)
            return n1.getNodeValue().equals(n2.getNodeValue());
        else
            return n1 == n2;
    }


}
