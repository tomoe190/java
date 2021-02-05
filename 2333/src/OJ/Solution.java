package OJ;

public class Solution {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null ) {
            return null;
        }
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode toDelete = prev.next;
                prev.next = toDelete.next;
            }else{
                prev = prev.next;
            }
        }
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        int val = 0;
        head = removeElements(head,val);
        traversal(head);
    }

    private static void traversal(ListNode head) {
        for(ListNode cur = head;cur != null;cur = cur.next) {
            System.out.println(cur.val);
        }
    }
}
