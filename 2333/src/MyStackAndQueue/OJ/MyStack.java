package MyStackAndQueue.OJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 用队列实现栈
public class MyStack {
    Queue<Integer> A = new LinkedList<>();
    Queue<Integer> B = new LinkedList<>();

    public void myStack() {

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

class MyQueue {
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();

    public void queue() {

    }

    public void offer(int x) {
        A.push(x);
    }

    public int pop() {
        if (A.isEmpty() && B.isEmpty()) {
            return 0;
        }
        while (A.size() > 1) {
            B.push(A.pop());
        }
        int ret = A.pop();
        while (B.size() != 0) {
            A.push(B.pop());
        }
        return ret;
    }

    public int peek() {
        if (A.isEmpty() && B.isEmpty()) {
            return 0;
        }
        while (A.size() > 1) {
            B.push(A.pop());
        }
        int ret = A.pop();
        B.push(ret);
        while (B.size() != 0) {
            A.push(B.pop());
        }
        return ret;
    }

    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}
