package MyStackAndQueue;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class MyStack2_LinkedList {
    private ListNode head = null;
    // 1、入栈
    public void push(int val) {
        ListNode newNode = new ListNode(val);
        // 不带傀儡节点，就需要判断链表是否空
        if (head == null) {
            head = newNode;
            return ;
        }
        newNode.next = head;
        head = newNode;
    }

    // 2、出栈
    public Integer pop () {
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

    // 3、取栈顶元素
    public Integer peek(){
        if (head == null) {
            return null;
        }
        return head.val;
    }

}
