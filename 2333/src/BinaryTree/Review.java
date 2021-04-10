package BinaryTree;

import java.util.Scanner;

public class Review {
    static class Node {
        char val;
        Node left;
        Node right;

        public Node(char val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        // 通过先序遍历结果，构建二叉树
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            String line = input.next();
            Node root = build(line);
            inOrder(root);
            System.out.println();
        }
    }

    private static void inOrder(Node root) {
        if (root == null) {
            return ;
        }
        inOrder(root.left);
        System.out.print(root.val);
        inOrder(root.right);
    }

    public static int index = 0;
    public static Node build(String line) {
        index = 0;
        return _build(line);
    }

    public static Node _build(String line) {
        char ch = line.charAt(index);
        if (ch == '#') {
            return null;
        }
        Node root = new Node(ch);
        index ++;
        root.left = _build(line);
        index ++;
        root.right = _build(line);
        return root;
    }

}
