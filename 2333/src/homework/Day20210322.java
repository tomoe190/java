package homework;

import java.util.*;

class TreeNode{
    char val;
    TreeNode left;
    TreeNode right;

    public TreeNode(char val) {
        this.val = val;
    }
}

public class Day20210322 {


//    public static boolean isCompleteTree(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        boolean isLevel2 = false;
//        while (true) {
//            TreeNode cur = queue.poll();
//            if (cur == null) {
//                break;
//            }
//            if (!isLevel2) {
//                if (cur.left != null && cur.right != null) {
//                    queue.offer(cur.left);
//                    queue.offer(cur.right);
//                } else if (cur.left == null && cur.right != null) {
//                    return false;
//                } else if (cur.left != null && cur.right == null) {
//                    isLevel2 = true;
//                    queue.offer(cur.left);
//                } else {
//                    isLevel2 = true;
//                }
//            } else {
//                if (cur.left != null || cur.right != null) {
//                    return false;
//                }
//            }
//        }
//        return true;
//     }

     // 层序遍历二叉树并且将其分层放入顺序链表中
//     public static List<List<TreeNode>> result = null;
//     public static List<List<TreeNode>> levelOrder(TreeNode root) {
//        List<List<TreeNode>> result = new ArrayList<>();
//        if (root == null) {
//            return result;
//        }
//        helper(root,0);
//        return result;
//     }
//
//    public static void helper(TreeNode root,int level) {
//        if (level == result.size()) {
//            result.add(new ArrayList<>());
//        }
//        result.get(level).add(root);
//       if (root.left != null) {
//            helper(root.left,level + 1);
//        }
//        if (root.right != null) {
//            helper(root.right,level +1);
//        }
//     }

     // 二叉树的公共祖先
//    public static TreeNode lca = null;
//    public static TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
//        if (root == null) {
//            return null;
//        }
//        find(root,p,q);
//        return lca;
//    }
//
//    public static boolean find(TreeNode root,TreeNode p,TreeNode q) {
//        if (root == null) {
//            return true;
//        }
//        int mid = (p == null || q == null) ? 1 : 0;
//        int left = find(root.left,p,q) ? 1 : 0;
//        int right = find(root.right,p,q) ? 1 : 0;
//        if (mid + left + right == 2) {
//            lca = root;
//        }
//        return (mid + left + right) > 0;
//    }

    public static int index = 0;
    public static TreeNode build(String line) {
        index = 0;
        return _build(line);
    }

    public static TreeNode _build(String line) {
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
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static List<List<TreeNode>> result = null;
    public static List<List<TreeNode>> levelOrder(TreeNode root) {
        List<List<TreeNode>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        helper(root,0);
        return result;
    }

    public static void helper (TreeNode root,int level) {
        if (level == result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(root);
        if (root.left != null) {
            helper(root.left,level + 1);
        }
        if (root.right != null) {
            helper(root.right,level +1);
        }
    }

    public static TreeNode lca = null;
    public static TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q) {
        if (root == null) {
            return null;
        }
        find(root,p,q);
        return lca;
    }

    public static boolean find(TreeNode root,TreeNode p,TreeNode q) {
        if (root == null) {
            return false;
        }
        int mid = (root == p || root == q) ? 1 : 0;
        int left = find(root.left,p,q) ? 1 : 0;
        int right = find(root.right,p,q) ? 1 : 0;
        if (mid + left +right == 2) {
            lca = root;
        }
        return mid + left + right > 0;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String line = scanner.next();
//            TreeNode root = build(line);
//            inOrder(root);
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.next();
            TreeNode root = build(line);
            inOrder(root);
            System.out.println();
        }
    }
}
