package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateTree {
    public static class TreeNode{
//        char val;
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }

    // 为了在递归过程中，也能明确的知道当前正在处理的节点的位置
    // 使用一个成员变量 index 记录当前节点对应的下标
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
//        char ch = line.charAt(index);
//        if (ch == '#') {
//            return null;
//        }
//        TreeNode root = new TreeNode(ch);
//        index ++;
//        root.left = _build(line);
//        index ++;
//        root.right = _build(line);
//        return root;
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

    // 二叉树的层序遍历
    public List<List<Integer>> result = null;
    public List<List<Integer>> level2(TreeNode root) {
        result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        helper(root,0);
        return result;
    }

    public void helper (TreeNode root,int level) {
        if (level == result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        if (root.left != null) {
            helper(root.left,level + 1);
        }
        if (root.right != null) {
            helper(root.right, level + 1);
        }
    }

    public TreeNode lca = null;
    public TreeNode lowestAncient(TreeNode root,TreeNode p,TreeNode q) {
        if (root == null) {
            return null;
        }
        find(root,p,q);
        return lca;
    }

    public boolean find(TreeNode root,TreeNode p,TreeNode q) {
        if (root == null) {
            return false;
        }
        int mid = (root == p || root == q) ? 1 : 0;
        int left = find(root.left,p,q) ? 1 : 0;
        int right = find(root.right,p,q) ? 1 : 0;
        if (mid + left + right == 2) {
            lca = root;
        }
        return mid + left + right > 0;
    }

    // 将二叉搜索树转换成一个排序的双向链表
    public static TreeNode convert(TreeNode root) {
        if(root == null) {
            // 空树直接返回链表
            return null;
        }
        if (root.left == null && root.right == null) {
            // 只有一个根节点的树，直接返回该节点
            return root;
        }
        //递归处理左子树，得到左子树链表的头节点
        TreeNode leftHead = convert(root.left);
        // 把当前节点尾插到左侧链表的末尾
        // 先找到左侧子树的末尾节点
        TreeNode leftTail = leftHead;
        while(leftTail != null && leftTail.right != null) {
            leftTail = leftTail.right;
        }
        // 进行尾插操作
        if (leftHead != null) {
            // 如果根节点的左子树是null
            leftTail.right = root;
            root.left = leftTail;
        }
        // 递归处理右子树
        TreeNode rightHead = convert(root.right);
        if (rightHead != null) {
            rightHead.left = root;
            root.right = rightHead;
        }
        // 最终返回组装好的链表的头节点
        return leftHead != null ? leftHead : root;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String line = scanner.next();
//            TreeNode root = build(line);
//            inOrder(root);
//            System.out.println();
//        }

    }

}
