package MyStackAndQueue.OJ;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    Queue<Integer> A = new LinkedList<>();
    Queue<Integer> B = new LinkedList<>();

    public void stack() {

    }

    public void push(int x) {
        A.offer(x);
    }

    public int pop() {
        if (A.isEmpty() && B.isEmpty()) {
            return 0;
        }
        if (A.size() > 1) {
            B.offer(A.poll());
        }
        int ret = A.poll();
        swapAB();
        return ret;
    }

    private void swapAB() {
        Queue<Integer> tmp = A;
        A = B;
        B = tmp;
    }

    public int top() {
        if (A.isEmpty() && B.isEmpty()) {
            return 0;
        }
        if (A.size() > 1) {
            B.offer(A.poll());
        }
        int ret = A.poll();
        B.offer(ret);
        swapAB();
        return ret;
    }

    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}
