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

    // 完全二叉树
    public static boolean isCompleteTree(TreeNode root) {
        // 通过层序遍历的方式来实现
        if (root == null) {
            return true;
        }
        // 分为两个阶段判定
        // 这个变量为 false ，表示当前是第一阶段
        // 变量名为 true 表示进入第二阶段
        boolean isLevel2 = false;

        // 层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(true) {
            TreeNode cur = queue.poll();
            if (cur == null) {
                break;
            }

            // 针对当前节点进行访问
            // 此处的访问是一系列的逻辑判断
            if (!isLevel2) {
                // 第一阶段的逻辑
                if (cur.left != null && cur.right != null) {
                    // 符合要求的节点，继续往下遍历
                    // 此时直接把左右子树入队列
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                } else if (cur.left == null && cur.right != null) {
                    // 第一阶段发现只有右子树的节点
                    // 说明这个树一定不是完全二叉树
                    return false;
                } else if (cur.left != null && cur.right == null) {
                    // 遇到了这个节点不符合第一阶段的条件
                    // 进入到第二阶段进行判定
                    isLevel2 = true;
                    queue.offer(cur.left);
                } else {
                    // 这个节点没有子树
                    // 也是进入到第二阶段进行判定
                    // 因为上一个 elseif 中需要入队列，所以这两步不能合并
                    isLevel2 = true;
                }
            } else {
                // 第二阶段的逻辑
                if (cur.left != null || cur.right != null) {
                    // 发现第二阶段的某个节点的子树不为空
                    // 此时就不是完全二叉树
                    return false;
                }
            }

        }
        // 遍历了整个树，都没有找到反例 return false，就 return true
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = build();
//        levelOrder(root);

        System.out.println(isCompleteTree(root));
    }
}
