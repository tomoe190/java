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

    public static void remove1(Node head,int val) {
        // 1 找到该值对应的位置
        //   同时找到前一个位置
        Node prev = head;
        while (prev != null && prev.next != null && prev.next.val == val) {
            prev = prev.next;
        }
        if(prev == null || prev.next == null) {
            return;
        }
        Node toDelete = prev.next;
        // 2 真正进行删除，toDelete 指向要被删除的节点
        prev.next = toDelete.next;
    }

    public static void remove1(Node head,Node toDelete) {
        // 时间复杂度 O(N)
//        Node prev = head;
//        while (prev != null
//                && prev.next != null
//                && prev.next != toDelete) {
//            prev = prev.next;
//        }
//        if (prev == null || prev.next == null) {
//            return;
//        }
//        prev.next = toDelete.next;

        // 时间复杂度 O(1)
//        toDelete.val = toDelete.next.val;
//        toDelete.next = toDelete.next.next;

    }

    public static void remove3(Node head,int index) {
        // 按照下标删除，其实就是按照给定第几个
        if(index < 0 || index >= size(head)) {
            return;
        }
        if(index == 0) {
            // TODO
        }
        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }
        Node toDelete = prev.next;
        prev.next = toDelete.next;
    }

    private static int size(Node head) {
        int size = 0;
        for(Node cur = head;cur != null;cur = cur.next) {
            size++;
        }
        System.out.println(size);
        return size;
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
//        Node newNode = new Node(90);
//        Node prev = head;
//        while (prev != null && prev.next != null) {
//            prev = prev.next;
//        }
//        prev.next = newNode;
//        traversal(head);

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

        remove3(head,2);
        traversal(head);
    }
}

