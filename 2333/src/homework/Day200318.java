package homework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day200318 {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node build() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        d.right = g;
        f.left = h;
        return a;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val);
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val);
    }

    public static int length(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + length(root.left) + length(root.right);
    }

    public static int getLeafSize(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize(root.left) + getLeafSize(root.right);
    }

    public static int getKLevelSize(Node root,int k) {
        if (root == null || k < 0) {
            return 0;
        }
        if (k == 1){
            return 1;
        }
        return getKLevelSize(root.left,k - 1) + getKLevelSize(root.right,k - 1);
    }

    public static Node find(Node root,int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        Node result = find(root.left,val);
        if(result != null) {
            return result;
        }
        return find(root.right,val);

    }

    // 判断是否是完全二叉树
//    public static boolean isCompleteTree(Node root) {
//        if (root == null) {
//            return true;
//        }
//        Queue<Node> queue = new LinkedList<>();
//        queue.offer(root);
//        boolean isLevel2 = false;
//
//        while (true) {
//            Node cur = queue.poll();
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
//    }

    public static boolean isCompleteTree(Node root) {
        if (root == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        boolean isLevel2 = false;
        while (true) {
            Node cur = queue.poll();
            if (cur == null) {
                break;
            }
            if (!isLevel2) {
                if (cur.left != null && cur.right != null) {
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                } else if (cur.left == null && cur.right != null) {
                    return false;
                } else if (cur.left != null && cur.right == null) {
                    isLevel2 = true;
                    queue.offer(cur.left);
                } else {
                    isLevel2 = true;
                }
            } else {
                if (cur.left != null || cur.right != null) {
                    return false;
                }
            }
        }
        return true;
    }

    // 层序遍历
    public static void levelOrder(Node root) {
        if (root == null) {
            return ;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (true) {
            Node cur = queue.poll();
            if (cur == null) {
                break;
            }
            System.out.print(cur.val);
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }

    // 对称二叉树
    public static boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left,root.right);
    }

    private static boolean isMirror(Node p, Node q) {
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

    public static boolean isBalanced(Node root) {
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

    private static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
    }

//    public static boolean isCompleteTree1(Node root) {
//        if (root == null) {
//            return true;
//        }
//        boolean isLevel2 = false;
//
//        Queue<Node> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (true) {
//            Node cur = queue.poll();
//            if (cur == null) {
//                break;
//            }
//
//            if (!isLevel2) {
//                // 第一阶段
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
//                // 第二阶段
//                if (cur.left != null || cur.right == null) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }


    public static void main(String[] args) {
        Node root = build();
//        preOrder(root);
//        inOrder(root);
//        postOrder(root);

//        System.out.println(length(root));

//        System.out.println(getLeafSize(root));

//        System.out.println(find(root,8).val);

//        levelOrder(root);

//        System.out.println(isSymmetric(root));

//        System.out.println(isBalanced(root));

//        System.out.println(getHeight(root));

        System.out.println(isCompleteTree(root));

    }
}
