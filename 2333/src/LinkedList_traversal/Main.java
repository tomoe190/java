package LinkedList_traversal;

public class Main {
    public static Node createList() {
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // 可以不写，因为Node方法将next默认设为null
        e.next = null;
        return a;
    }

    public static void main(String[] args) {
        Node head = createList();
        System.out.println("(1)打印链表中的每个元素:");
        for(Node cur = head;cur != null;cur = cur.next) {
            System.out.print(cur.val);
        }
        System.out.println();

        System.out.println("(2)最后一个节点:");
        Node cur = head;
        while(cur != null && cur.next != null) {
            cur = cur.next;
        }
        System.out.println(cur.val);

        System.out.println("(3)倒数第 2 个节点：");
        cur = head;
        while(cur != null && cur.next.next != null) {
            cur = cur.next;
        }
        System.out.println(cur.val);

        System.out.println("(4)第 N(3) 个节点：");
        cur = head;
        int N = 3;
        for (int i = 1; i < N; i++) {
            cur = cur.next;
        }
        System.out.println(cur.val);

        System.out.println("(5)计算元素个数：");
        int count = 0;
        for(cur = head;cur != null;cur = cur.next) {
            count ++;
        }
        System.out.println(count);

        System.out.println("(6)是否包含 ”6“ ：");
        int toFind = 6;
        for(cur = head;cur != null;cur = cur.next) {
            if(cur.val == toFind) {
                break;
            }
        }
        if(cur != null) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("(7)打印倒数第 3 个数");
        count = 0;
        for(cur = head;cur != null;cur = cur.next) {
            count ++;
        }
        int minusN = 3;
        int plusN = count + 1 - minusN;
        cur = head;
        for (int i = 1; i < plusN; i++) {
            cur = cur.next;
        }
        System.out.println(cur.val);


        // 1 遍历链表
//        for (Node cur = head; cur != null ; cur=cur.next) {
//            System.out.println(cur.val);
//        }
        // 2 找最后一个节点
//        Node cur = head;
//        while(cur != null && cur.next != null) {
//            cur = cur.next;
//        }
//        System.out.println();

        // 3 找倒数第二个节点
//        Node cur = head;
//        while(cur != null && cur.next != null && cur.next.next != null) {
//            cur = cur.next;
//        }
//        System.out.println(cur.val);

        // 4 找到第 N 个节点
//        int N = 3;
//        Node cur = head;
//        for (int i = 1; i < N; i ++) {
//            cur = cur.next;
//        }
//        System.out.println(cur.val);

        // 5 获取链表长度
//        int count = 0;
//        for (Node cur = head;cur!= null ; cur = cur.next) {
//            count ++;
//        }
//        System.out.println(count);

        // 6 查找某个元素是否在链表中
//        int toFind = 5;
//        Node cur = head;
//        for (;cur != null;cur = cur.next) {
//            if(cur.val == toFind) {
//                break;
//            }
//        }
//        if (cur != null) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

        // 7 查找倒数第 N 个元素
//        int count = 0;
//        int minusN = 1;
//        Node cur = head;
//        for (;cur != null;cur = cur.next) {
//            count ++;
//        }
//        int plusN = count + 1 - minusN;
//        cur = head;
//        for (int i = 0; i < plusN; i++) {
//            cur = cur.next;
//        }
//        System.out.println(plusN);


    }
}
