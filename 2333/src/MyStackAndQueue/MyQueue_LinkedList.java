package MyStackAndQueue;

public class MyQueue_LinkedList {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode head = null;
    private ListNode tail = null;

    // 1、入队列
    public boolean offer(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return true;
        }
        tail.next = newNode;
        tail = tail.next;
        return true;
    }

    // 2、出队列
    public Integer poll() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            int ret = head.val;
            head = null;
            return ret;
        }
        int ret = head.val;
        head = head.next;
        return ret;
    }

    // 3、取队首元素
    public Integer peek() {
        if (head == null) {
            return null;
        }
        return head.val;
    }

    public static void main(String[] args) {
        MyQueue_LinkedList myQueue = new MyQueue_LinkedList();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);

        Integer ret = myQueue.poll();
        System.out.println("ret = " + ret);
        ret = myQueue.poll();
        System.out.println("ret = " + ret);
        ret = myQueue.poll();
        System.out.println("ret = " + ret);
        ret = myQueue.poll();
        System.out.println("ret = " + ret);
        ret = myQueue.poll();
        System.out.println("ret = " + ret);

    }
}
