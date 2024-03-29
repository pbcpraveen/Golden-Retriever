package helper;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.*;

public class RelativePathFunctions {


    public static List<Node> relativePath(Node node, String path) {
        List<Node> result = new ArrayList<>();
        NodeList children  = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeName().equals(path)) {
                result.add(child);
            }
        }
        return result;
    }

     public static List<Node> getAllChildren(Node node) {
        if (node == null)
            return Collections.emptyList();
         List<Node> result = new ArrayList<>();
         NodeList children = node.getChildNodes();
         for (int i = 0; i < children.getLength(); i++) {
             Node child = children.item(i);
             if (CommonUtils.isValidNode(child))
                result.add(child);
         }
         return result;
     }

     public static List<Node> getAllChildrenRecursive(Node node) {
         if (node == null)
             return Collections.emptyList();
        if (node.getChildNodes().getLength() == 0)
            return Collections.emptyList();
         List<Node> result = new ArrayList<>();
         NodeList children = node.getChildNodes();
         for (int i = 0; i < children.getLength(); i++) {
             Node child = children.item(i);
             if (CommonUtils.isValidNode(child))
                result.add(child);
             result.addAll(getAllChildrenRecursive(child));
         }
         return result;
     }

     public static List<Node> getParent(Node node) {
        if (node.getParentNode() == null)
            return Collections.emptyList();
        return Collections.singletonList(node.getParentNode());
     }

     public static Node getText(Node node) {
        if (node.getNodeType() == Node.TEXT_NODE)
            return null;
        String value =  node.getTextContent();
        return node.getOwnerDocument().createTextNode(value);
     }

     public static Node getTextNode(String text, Node node) {
        return node.getOwnerDocument().createTextNode(text);
     }

    public static Node getAttribute(Node node, String attrName){
        return node.getAttributes().getNamedItem(attrName);
    }


    public static List<Node> getNodesConcatenatedPath(List<Node> current, String rp2){
        Set<Node> result = new HashSet<>();
        for (Node n : current){
            result.addAll(relativePath(n, rp2));
        }
        return new ArrayList<>(result);
    }

    public static List<Node> getNodesConcatenatedPathRecursive(List<Node> current, String rp2){
        Set<Node> result = new HashSet<>(getNodesConcatenatedPath(current, rp2));
        for (Node n : current){
            result.addAll(getNodesConcatenatedPathRecursive(getAllChildren(n), rp2));
        }
        return new ArrayList<>(result);
    }

    public static List<Node> mergeLists(List<Node> list1, List<Node> list2){
        List<Node> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }


}
