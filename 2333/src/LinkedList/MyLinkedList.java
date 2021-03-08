package LinkedList;

class ListNode {
    int val;
    ListNode prev = null;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}

// 实现一个双向链表
public class MyLinkedList {
    // 记录头、尾节点的位置
    private ListNode head;
    private ListNode tail;
    // 记录长度，空间换时间
    private int length = 0;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int length(){
        return this.length;
    }

    // 1. 插入操作
    // 1.1 头插
    public void addFirst(int val){
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length ++;

    }

    // 1.2 尾插
    public void addLast(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
        length ++;
    }

    // 1.3 指定位置插入
    public void add(int index,int val) {
        if (index < 0 || index >= length) {
            return;
        }
        if (index == 0) {
            addFirst(val);
        }
        if (index == length) {
            addLast(val);
        }
        ListNode newNode = new ListNode(val);
        ListNode nextNode = getNode(index);
        ListNode prevNode = getNode(index - 1);
        newNode.next = nextNode;
        nextNode.prev = newNode;

        newNode.prev = prevNode;
        prevNode.next = newNode;
        length ++;
    }

    // 2. 删除操作
    // 2.1 按下标删除
    public void removeByIndex(int index) {
        if (index < 0 || index > length) {
            return ;
        }
        if (index ==0) {
            removeFirst();
            return;
        }
        if (index == length - 1) {
            removeLast();
            return;
        }
        ListNode toDelete = getNode(index);
        ListNode prevNode = toDelete.prev;
        ListNode nextNode = toDelete.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        length --;
    }

    // 2.2 按值删除
    public void removeByValue(int val) {
        int index = indexOf(val);
        if (index == -1){
            return ;
        }
        removeByIndex(index);
    }

    // 2.3 头删
    public void removeFirst() {
        if (head == null){
            return ;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            length = 0;
            return ;
        }
        ListNode nextNode = head.next;
        nextNode.prev = null;
        head = nextNode;
        length --;
    }
    // 2.4 尾删
    public void removeLast() {
        if (head == null){
            return ;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            length = 0;
            return ;
        }
        ListNode prevNode = tail.prev;
        prevNode.next = null;
        tail = prevNode;
        length --;
    }
    // 3. 查找
    // 3.1 给定下标去找节点
    public ListNode getNode(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        ListNode cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    // 3.2 给定下标去找值
    public int indexOf(int index) {
        return getNode(index).val;

    }

    //3.3 给定值去找下标
    public int getVal(int val) {
        ListNode cur = head;
        for (int i = 0; i < length; i++) {
            if (cur.val == val) {
                return i;
            }
            cur = cur.next;
        }
        return -1;
    }

    // 4. 修改
    public void set(int index,int val) {
        ListNode listNode = getNode(index);
        listNode.val = val;
    }
}
