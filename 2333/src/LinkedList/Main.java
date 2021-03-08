package LinkedList;

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

    public static Node remove1(Node head,int val) {
        // 1 找到该值对应的位置
        //   同时找到前一个位置
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            head = head.next;
            return head;
        }
        Node prev = head;
        while (prev.next != null && prev.next.val != val) {
            prev = prev.next;
        }
        if(prev.next == null) {
            System.out.println("未找到");
            return null;
        }
        Node toDelete = prev.next;
        // 2 真正进行删除，toDelete 指向要被删除的节点
        prev.next = toDelete.next;
        return head;
    }

    public static Node remove2(Node head,Node toDelete) {
        // 时间复杂度 O(N)
        if (head == null) {
            return null;
        }
        if (head == toDelete) {
            head = head.next;
            return head;
        }
        Node prev = head;
        while ( prev.next != null && prev.next != toDelete) {
            prev = prev.next;
        }
        if (prev.next == null) {
            System.out.println("未找到");
            return null;
        }
        prev.next = toDelete.next;

        // 时间复杂度 O(1)
//        toDelete.val = toDelete.next.val;
//        toDelete.next = toDelete.next.next;
        return head;
    }

    public static Node remove3(Node head,int index) {
        // 按照下标删除，其实就是按照给定第几个
        System.out.println("删除下标为" + index + "的元素：");
        if(index < 0 || index >= size(head)) {
            return null;
        }
        if(index == 0) {
            head = head.next;
            return head;
        }
        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }
        Node toDelete = prev.next;
        prev.next = toDelete.next;
        return head;
    }

    private static int size(Node head) {
        int size = 0;
        for(Node cur = head;cur != null;cur = cur.next) {
            size++;
        }
        return size;
    }

    public static void removeWithDummy1(Node head,int val) {
        Node prev = head;
        while (prev.next != null && prev.next.val != val) {
            prev = prev.next;
        }
        if (prev.next == null) {
            System.out.println("未找到,链表内容为：");
            return;
        }
        Node toDelete = prev.next;
        prev.next = toDelete.next;
    }

    public static void removeWithDummy2(Node head,Node toDelete) {
        Node prev = head;
        while (prev.next != null && prev.next != toDelete) {
            prev = prev.next;
        }
        if (prev.next == null) {
            System.out.println("未找到,链表内容为：");
            return;
        }
        toDelete = prev.next;
        prev.next = toDelete.next;
    }

    public static void removeWithDummy3(Node head,int index) {
        Node prev = head;
        if(index < 0 || index > sizeWithDummy(head)) {
            System.out.println("未找到,链表内容为：");
            return;
        }
        for (int i = 0; i < index ; i++) {
            prev = prev.next;
        }
        Node toDelete = prev.next;
        prev.next = toDelete.next;
    }

    public static int sizeWithDummy(Node head) {
        int size = 0;
        for(Node cur = head.next;cur != null;cur = cur.next) {
            size ++;
        }
        System.out.println(size);
        return size;
    }

    // 尾删除
        public static Node removeTail(Node head) {
            if(head == null ){
                return null;
            }
            Node prev = head;
            while (prev.next != null && prev.next.next != null) {
                prev = prev.next;
            }
            prev.next = null;
            return head;
        }

        public static Node arrayToLinkedList(int[] arr) {
            Node head = null;
            Node tail = null;
            for (int x : arr) {
                Node node = new Node(x);
                if(head == null) {
                    head = node;
                    tail = node;
                }else {
                    tail.next = node;
                    tail = tail.next;
                }
            }
            return head;
        }

    public static Node arrayToLinkedListWitDummy(int[] arr) {
        Node head = new Node(0);
        Node tail = head;
        for(int x : arr) {
            Node node = new Node(x);
            tail.next = node;
            tail = tail.next;
        }
        // 返回不带傀儡节点的链表
        //return head.next;
        // 返回带傀儡节点的链表
        return head;
    }

        public static void main(String[] args) {
//         无傀儡节点
//        // 插入到中间位置
        Node head = createLinkedList();
//        Node prev = head;
//        Node newNode = new Node(50);
//        newNode.next = prev.next;
//        prev.next = newNode;

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




        // 测试无傀儡节点删除
//       head = remove1(head,1);
//       traversal(head);

//        int num = 1;
//        Node cur = head;
//        while (cur != null && cur.val != num) {
//                cur = cur.next;
//        }
//        head = remove2(head,cur);
//        traversal(head);

//        head = remove3(head,0);
//        traversal(head);

//        head = removeTail(head);
//        traversal(head);

        // 测试有傀儡节点的删除
//        Node head = createLinkedListWithDummy();
//        removeWithDummy1(head,5);
//        traversalWithDummy(head);

//        int num = 6;
//        Node cur = head.next;
//        while (cur != null && cur.val != num) {
//            cur = cur.next;
//        }
//        removeWithDummy2(head,cur);
//        traversalWithDummy(head);

//        removeWithDummy3(head,6);
//        traversalWithDummy(head);

        // 数组转换成链表
        int[] arr = {2,4,6,8,10,12};

        head = arrayToLinkedList(arr);
        traversal(head);

        Node head2 = arrayToLinkedListWitDummy(arr);
        traversalWithDummy(head2);


    }
}

