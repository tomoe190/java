package LinkedList_OJ;

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Test {

    // 返回链表的中间节点，如果有两个中间结点，返回第二个中间结点
    public static ListNode middleNode (ListNode head) {
        if (head == null) {
            return null;
        }
        int len = getLength(head);
        int steps = len / 2 ;
        ListNode cur = head;
        for (int i = 0; i < steps; i++) {
            cur = cur.next;
        }
        return cur;
    }

    private static int getLength(ListNode head) {
        int length = 0;
        for (ListNode cur = head;cur != null; cur = cur.next) {
            length ++;
        }
        return length;
    }

    // 链表中倒数第 k 个节点
    public static ListNode FindKthToTail(ListNode head,int k) {
        int len = getLength(head);
        if (head == null) {
            return null;
        }
        if (k > len) {
            return null;
        }
        int steps = len - k;
        ListNode cur = head;
        for(int i = 0;i < steps;i ++) {
            cur = cur.next;
        }
        return cur;
    }

    // 合并两个有序链表
    public static ListNode mergeTwoList (ListNode l1,ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode newHead = new ListNode(0);
        ListNode newTail = newHead;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        while (cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                newTail.next = cur1;
                cur1 = cur1.next;
            } else {
                newTail.next = cur2;
                cur2 = cur2.next;
            }
            newTail = newTail.next;
        }
        if (cur1 == null) {
            newTail = cur2;
        }
        if (cur2 == null) {
            newTail = cur1;
        }
        return newHead.next;
    }

    // 以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前，且不能改变顺序
    public static ListNode partition (ListNode pHead, int x) {
        if (pHead == null) {
            return null;
        }
        if (pHead.next == null) {
            return pHead;
        }
        ListNode cur = pHead;
        ListNode smallHead = new ListNode(0);
        ListNode smallTail = smallHead;
        ListNode largeHead = new ListNode(0);
        ListNode largeTail = largeHead;
        while (cur != null) {
            if (cur.val < x) {
                smallTail.next = cur;
                cur = cur.next;
                smallTail = smallTail.next;
            } else {
                largeTail.next = cur;
                cur = cur.next;
                largeTail = largeTail.next;
            }
        }
        smallTail.next = largeHead.next;
        return smallHead.next;
    }

    // 反转链表
    public static ListNode reverseList (ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = createListNode();
//        System.out.println(middleNode(head));
//        System.out.println(FindKthToTail(head,3));
        System.out.println(partition(head,3));
    }

    public static ListNode createListNode () {
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        return a;
    }

}
