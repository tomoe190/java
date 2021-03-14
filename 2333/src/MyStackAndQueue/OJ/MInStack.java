package MyStackAndQueue.OJ;

import sun.plugin2.main.client.DisconnectedExecutionContext;

import java.util.Stack;

class MInStack {
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();

    public void MinStack() {

    }

    public void push(int x) {
        A.push(x);
        if (B.isEmpty()) {
            B.push(x);
            return;
        }
        int min = B.peek();
        if (x < min) {
            min = x;
        }
        B.push(min);
    }

    public void pop() {
        if (A.isEmpty()) {
            return;
        }
        A.pop();
        B.pop();
    }

    public int top() {
        if (A.isEmpty()) {
            return 0;
        }
        return A.peek();
    }

    public int getMin() {
        if (B.isEmpty()) {
            return 0;
        }
        return B.peek();
    }
}
