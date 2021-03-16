package BinaryTree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class OJ {
    public TreeNode build() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }

    // 前序遍历
    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.add(root.val);
        result.addAll(preOrderTraversal(root.left));
        result.addAll(preOrderTraversal(root.right));
        return result;
    }

    // 中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }



    // 后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.addAll(postorderTraversal(root.left));
        result.addAll(postorderTraversal(root.right));
        result.add(root.val);
        return result;
    }

    public boolean isSameTree (TreeNode p,TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public boolean isSubTree (TreeNode s,TreeNode t) {
        if (s == null) {
            return false;
        }
        if (isSameTree(s,t)) {
            return true;
        }
        return isSubTree(s.left,t) || isSubTree(s.right,t);
    }

}
