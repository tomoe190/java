package review;

import ArrayList.OJ.ListNode;

public class Review {

    // 删除链表中等于给定值的节点
    public static ListNode removeElements(ListNode head,int val){
        if (head == null) {
            return null;
        }
        for (ListNode cur = head; cur != null ; cur = cur.next) {
            if (cur.next.val == val){
                ListNode toDelete = cur.next;
                cur.next = toDelete.next;
            }
        }
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }

}
