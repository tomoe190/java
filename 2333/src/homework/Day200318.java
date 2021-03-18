package homework;

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

    public static void main(String[] args) {
        Node root = build();
//        preOrder(root);
//        inOrder(root);
//        postOrder(root);

//        System.out.println(length(root));

//        System.out.println(getLeafSize(root));

        System.out.println(find(root,8).val);
    }
}
