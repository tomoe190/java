package ArrayList.OJ;

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

//    public static ListNode reverseList(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        if (head.next == null) {
//            return head;
//        }
//        ListNode prevNode = null;
//        ListNode curNode = head;
//        while (curNode != null) {
//            ListNode nextNode = curNode.next;
//            curNode.next = prevNode;
//            prevNode = curNode;
//            curNode = nextNode;
//        }
//        return prevNode;
//    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode prevNode = null;
        ListNode curNode = head;
        while (curNode != null) {
            ListNode nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }
        return prevNode;
    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        int val = 1;
//        head = removeElements(head,val);
//        traversal(head);

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        ListNode head = a;
        traversal(head);
        ListNode result = reverseList(head);
        traversal(result);

    }

    private static void traversal(ListNode head) {
        for(ListNode cur = head;cur != null;cur = cur.next) {
            System.out.print(cur.val + " ");
        }
        System.out.println();
    }
}
