package BinaryTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class class1 {
    public void func1() {
//        func3();    // 实例方法调用其他类的实例方法
    }
    public static void func4() {

    }

}

class class2 extends class1 {
    public void func2() {
        func4();    // 实例方法调用超类的类方法
        func1();    // 实例方法调用超类的实例方法
        func5();    // 实例方法调用本类的类方法
    }
    public static void func5() {
    }
    private String name="Person";

}

class class3 {
    public void func3() {
    }
}

public class Review extends class2{
//    static class Node {
//        char val;
//        Node left;
//        Node right;
//
//        public Node(char val) {
//            this.val = val;
//        }
//    }
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();


        // 通过先序遍历结果，构建二叉树
//        Scanner input = new Scanner(System.in);
//        while(input.hasNext()) {
//            String line = input.next();
//            Node root = build(line);
//            inOrder(root);
//            System.out.println();
//        }

//        int n = 10;
//        if (n > 5) {
//            n = 5;
//        } else if (n > 8) {
//            n = 8;
//        }
//        System.out.println(n);

//        Scanner scanner = new Scanner(System.in);
//        StringBuffer stringBuffer = new StringBuffer();
//        while (scanner.hasNextLine()) {
//            String input = scanner.nextLine();
//            String[] tmp = input.split(" ");
//            for(int i = tmp.length;i >= 0; i--) {
//                stringBuffer.append(tmp[i]);
//                if (i != 0) {
//                    stringBuffer.append(" ");
//                }
//            }

//        }
//        System.out.println(stringBuffer.toString());
    }



    private static void inOrder(Node root) {
        if (root == null) {
            return ;
        }
        inOrder(root.left);
        System.out.print(root.val);
        inOrder(root.right);
    }

//    public static int index = 0;
//    public static Node build(String line) {
//        index = 0;
//        return _build(line);
//    }

//    public static Node _build(String line) {
//        char ch = line.charAt(index);
//        if (ch == '#') {
//            return null;
//        }
//        Node root = new Node(ch);
//        index ++;
//        root.left = _build(line);
//        index ++;
//        root.right = _build(line);
//        return root;
//    }

}

