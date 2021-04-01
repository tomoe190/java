package homework;

import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    Node left;
    Node right;
}

public class Day20210331 {
    public static List<Node> preOrderTraversal (Node root) {
        List<Node> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.add(root);

    }
}
