//package BinaryTree;
//
//import java.util.Scanner;
//
//public class CreateTree {
//    public static class TreeNode{
//        char val;
//        TreeNode left;
//        TreeNode right;
//
//        public TreeNode(char val) {
//            this.val = val;
//        }
//    }
//
//    // 为了在递归过程中，也能明确的知道当前正在处理的节点的位置
//    // 使用一个成员变量 index 记录当前节点对应的下标
//    public static int index = 0;
//    public static TreeNode build(String line) {
//        // 由于我们的用例可能有多组
//        // 需要保证每组用例开始递归之前
//        // 都把 index 设为 0，保证多个用例之间互不干扰
//        index = 0;
//        return _build(line);
//    }
//
//    // 实际上我们是通过这个 _build 方法来进行递归的
//    // 不能直接拿 build 来递归
//    // 因为 build 里有一个 index = 0
//    // 如果递归中执行这个语句，index 的值就会发生混乱
//    public static TreeNode _build(String line) {
//
//    }
//
//    public static void inOrder(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        inOrder(root.left);
//        // 注意题目中要求的输出格式，是一组结果在一行，每个节点之间用一个空格来分开
//        System.out.print(root.val + " ");
//        inOrder(root.right);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String line = scanner.next();
//            TreeNode root = build(line);
//            System.out.println();
//        }
//
//    }
//
//}
