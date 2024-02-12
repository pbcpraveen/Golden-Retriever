package evaluator;

import org.w3c.dom.Node;

import java.util.List;

public class AbsolutePathFunctions {
    public static List<Node> absolutePath(Node node,  String path) {
        return RelativePathFunctions.relativePath(node, path);
    }
//    public static List<Node> absolutePathRecursive(Node node,  String path1, String path2) {
//        return RelativePathFunctions.getNodesConcatenatedPathRecursive(node, path1, path2);
//    }

}
