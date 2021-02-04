package LinkedList_insert;

public class Main {
    public static Node createLinkedList() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        return a;
    }
    public static void traversal(Node head) {
        for(Node cur = head;cur != null;cur = cur.next) {
            System.out.print(cur.val + " ");
        }
    }

    public static Node createLinkedListWithDummy() {
        Node dummy = new Node(0);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        dummy.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        return dummy;
    }
    public static void traversalWithDummy (Node head) {
        for(Node cur = head.next;cur != null;cur = cur.next) {
            System.out.print(cur.val + " ");
        }
    }

    public static void main(String[] args) {
//         无傀儡节点
//        // 插入到中间位置
        Node head = createLinkedList();
//        Node prev = head;
//        Node newNode = new Node(50);
//        newNode.next = prev.next;
//        prev.next = newNode;
//
//        // 插入到最头部
//        Node newNode = new Node(70);
//        newNode.next = head;
//        head = newNode;
//        traversal(head);

        // 插入到尾部
        Node newNode = new Node(90);
        Node prev = head;
        while (prev != null && prev.next != null) {
            prev = prev.next;
        }
        prev.next = newNode;
        traversal(head);

        // 空链表插入
        Node newNode = new Node(90);


        // 有傀儡节点
        // 插入数据，插到头部、中间都一样
//        Node head = createLinkedListWithDummy();
//        Node newNode = new Node(110);
        // 1 和 2 之间
//        Node prev = head.next;
//        newNode.next = prev.next;
//        prev.next = newNode;
//        traversalWithDummy(head);

        // 插入到头部
//        Node prev = head;
//        newNode.next = prev.next;
//        prev.next = newNode;
//        traversalWithDummy(head);
    }
}

