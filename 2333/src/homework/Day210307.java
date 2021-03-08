package homework;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Day210307 {
    public int getLength(ListNode head) {
        int length = 0;
        for(ListNode cur = head;cur != null;cur = cur.next) {
            length ++;
        }
        return length;
    }

    // 判定链表相交
    public ListNode getIntersectionNode(ListNode headA ,ListNode headB) {
        int len1 = getLength(headA);
        int len2 = getLength(headB);
        int steps = 0;
        if (len1 > len2) {
            steps = len1 - len2;
            for (int i = 0; i < steps; i++) {
                 headA = headA.next;
            }
        } else {
            steps = len2 - len1;
            for (int i = 0; i < steps; i++) {
                headB = headB.next;
            }
        }
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        while (cur1 != null && cur2 != null) {
            if (cur1 == cur2) {
                return cur1;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return null;
    }

    // 判断链表是否带环
    public boolean hasCycle (ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // 判定链表是否回文
    // 创建新链表
    public boolean chKPalindrome1(ListNode A) {
        if (A == null || A.next == null) {
            return true;
        }
        ListNode newHead = new ListNode(0);
        ListNode newTail = newHead;
        for (ListNode cur = A;cur != null;cur = cur.next) {
            newTail.next = new ListNode(cur.val);
            newTail = newTail.next;
        }
        ListNode B = newHead.next;
        ListNode prev = null;
        ListNode cur = B;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        B = prev;
        while (A != null && B!= null) {
            if (A != B) {
                return false;
            }
            A = A.next;
            B = B.next;
        }
        return true;
    }

    // 判断链表是否是回文结构
    // 不创建新链表
    public boolean chKPalindrome2 (ListNode A) {
        if (A == null || A.next == null) {
            return false;
        }
        int len = getLength(A);
        int steps = len / 2;
        ListNode B = A;
        for (int i = 0; i < steps; i++) {
            B = B.next;
        }
        ListNode prev = null;
        ListNode cur = B;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        B = prev;

        while (A != null && B != null) {
            if (A.val != B.val) {
                return false;
            }
            A = A.next;
            B = B.next;
        }
        return true;
    }

    // 删除重复的节点
    public ListNode deleteDuplication (ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode newHead = new ListNode(0);
        ListNode newTail = newHead;
        ListNode cur = pHead;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur != null && cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
            } else {
                newTail.next = cur;
                newTail = newTail.next;
            }
            cur = cur.next;
        }
        return newHead.next;
    }

    // 求环的入口点
    public ListNode detectCycle (ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }

        ListNode cur1 = fast;
        ListNode cur2 = head;
        while (cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }
}
