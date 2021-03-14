package BinaryTree;

class Node {
    String val;
    Node left;
    Node right;

    public Node(String val) {
        this.val = val;
    }
}

public class BinaryTree {
    public static Node build() {
        Node a = new Node("A");
        Node b = new Node("A");
        Node c = new Node("A");
        Node d = new Node("A");
        Node e = new Node("A");
        Node f = new Node("A");
        Node g = new Node("A");

        a.left = b;
        a.right = c;

    }

    public static void preOrder(Node root) {

    }
}
