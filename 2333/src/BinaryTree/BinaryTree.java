package BinaryTree;

class Node {
    String val;
    Node left;
    Node right;

    public Node(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "[" + val + "]";
    }
}

//class Node2{
//    String val;
//    Node left;
//    Node right;
//    Node parent;
//
//    public Node2(String val) {
//        this.val = val;
//    }
//}

public class BinaryTree {
    public static Node build() {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g  = new Node("G");
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;

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
            return ;
        }
        inOrder(root.left);
        System.out.print(root.val);
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val);
    }

    public static int count = 0;
    public static void length(Node root) {
        if (root == null) {
            return;
        }
        count ++;
        length(root.left);
        length(root.right);
    }

    public static int length2(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + length2(root.left) + length2(root.right);
    }

    public static int LeafSize = 0;
    public static void getLeafSize(Node root) {
        if (root == null) {
            return ;
        }
        if (root.left == null && root.right == null) {
            LeafSize ++;
        }
        getLeafSize(root.left);
        getLeafSize(root.right);
    }

    public static int getLeafSize2(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    public static int getKLevelSize(Node root,int k) {
        if (root == null || k < 1) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getKLevelSize(root.left,k - 1) + getKLevelSize(root.right,k - 1);
    }

    public static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
       return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
    }

    public static Node find(Node root,String toFind) {
        if (root == null) {
            return null;
        }
        if (root.val.equals(toFind)) {
            return root;
        }
        Node ret = find(root.left,toFind);
        if (ret != null) {
            return ret;
        }
        return find(root.right,toFind);
    }

    public static void main(String[] args) {
        Node root = build();
//        preOrder(root);
//        inOrder(root);
//        postOrder(root);

//        length(root);
//        System.out.println(count);

//        System.out.println(length2(root));

//        getLeafSize(root);
//        System.out.println(LeafSize);

//        System.out.println(getLeafSize2(root));

//        System.out.println(getKLevelSize(root,5));

//        System.out.println(getHeight(root));
        Node ret = find(root,"G");
        System.out.println(ret);
    }

}
