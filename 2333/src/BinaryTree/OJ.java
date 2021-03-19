package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class OJ {
    public static TreeNode build() {
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

    // 1.前序遍历
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

    // 2.中序遍历
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

    // 3.后序遍历
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

    // 4.判断两个树是否相同
//    public boolean isSameTree (TreeNode p,TreeNode q) {
//        if (p == null && q == null) {
//            return true;
//        }
//        if (p == null || q == null) {
//            return false;
//        }
//        if (p.val != q.val) {
//            return false;
//        }
//        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//    }

//    public static boolean isSameTree(TreeNode p,TreeNode q) {
//        if (p == null && q == null) {
//            return true;
//        }
//        if (p == null || q == null) {
//            return false;
//        }
//        if (p.val != (q.val)) {
//            return false;
//        }
//        return isSameTree(p.left,q.left) &&﻿ isSameTree(p.right,q.right);﻿﻿  ﻿
//    }

    // 5.判断树 t 是否是树 s 的子树
//    public boolean isSubTree (TreeNode s,TreeNode t) {
//        if (s == null) {
//            return false;
//        }
//        if (isSameTree(s,t)) {
//            return true;
//        }
//        return isSubTree(s.left,t) || isSubTree(s.right,t);
//    }
    public static boolean isSubTree(TreeNode s,TreeNode t) {
        if (s == null) {
            return false;
        }
        if (isSameTree(s,t)) {
            return true;
        }
        return isSubTree(s.left,t) || isSubTree(s.right,t);
    }

    public static boolean isSameTree(TreeNode p,TreeNode q) {
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

    // 6.求树的高度
    public int getHeight (TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
    }

    // 7.判断是否是平衡二叉树
    public boolean isBalanced (TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (leftHeight - rightHeight > 1 || leftHeight - rightHeight < -1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    // 8.对称二叉树
//    public boolean isSymmetric (TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        return isMirror(root.left,root.right);
//    }
//
//    public boolean isMirror( TreeNode p, TreeNode q) {
//        if (p == null && q == null) {
//            return true;
//        }
//        if (p == null || q == null) {
//            return false;
//        }
//        if (p.val != q.val) {
//            return false;
//        }
//        return isMirror(p.left,q.right) && isMirror(p.right,q.left);
//    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left,root.right);
    }

    private boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }




    // 层序遍历
//    public static void levelOrder(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        Queue<TreeNode> result = new LinkedList<>();
//        result.offer(root);
//        while(true) {
//            TreeNode cur = result.poll();
//            if (cur == null) {
//                break;
//            }
//            System.out.print(cur.val);
//            if (cur.left != null) {
//                result.offer(cur.left);
//            }
//            if (cur.right != null) {
//                result.offer(cur.right);
//            }
//        }
//    }

    public static void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> result = new LinkedList<>();
        result.offer(root);
        while (true) {
            TreeNode cur = result.poll();
            if (cur == null) {
                break;
            }
            System.out.print(cur.val);
            if (cur.left != null) {
                result.offer(cur.left);
            }
            if (cur.right != null) {
                result.offer(cur.right);
            }
        }
    }

    public static boolean isCompleteTree(TreeNode root) {

    }

    public static void main(String[] args) {
        TreeNode root = build();
        levelOrder(root);
    }
}
