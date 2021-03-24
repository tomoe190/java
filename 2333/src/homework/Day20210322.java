package homework;

import java.util.Scanner;

class TreeNode{
    char val;
    TreeNode left;
    TreeNode right;

    public TreeNode(char val) {
        this.val = val;
    }
}

public class Day20210322 {
    public static int index = 0;
    public static TreeNode build(String line) {
        index = 0;
        return _build(line);
    }

    public static TreeNode _build(String line){
        char ch = line.charAt(index);
        if (ch == '#') {
            return null;
        }
        TreeNode root = new TreeNode(ch);
        index ++;
        root.left = _build(line);
        index ++;
        root.right = _build(line);
        return root;
    }

    public static void inOrder(TreeNode root) {
        if (root == null) {
            return ;
        }
        inOrder(root.left);
        System.out.print(root.val + ' ');
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.next();
            TreeNode root = build(line);
            inOrder(root);
            System.out.println();
        }
    }
}
