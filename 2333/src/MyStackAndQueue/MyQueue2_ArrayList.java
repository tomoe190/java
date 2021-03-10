package MyStackAndQueue;

public class MyQueue2_ArrayList {
    private int[] data = new int[100];
    private int head = 0;
    private int tail = 0;
    int size = 0;

    // 1、入队列
    public boolean push(int val) {
        if (size == data.length) {
            return false;
        }
        data[tail] = val;
        tail ++;
        if (tail == data.length) {
            tail = 0;
        }
        size ++;
        return true;
    }

    // 2、出队列
    public Integer poll() {
        if (size == 0) {
            return null;
        }
        int ret = data[head];
        head ++;
        if (head == data.length) {
            head = 0;
        }
        size --;
        return ret;
    }

    // 3、取队首元素
    public Integer peek() {
        if (size == 0) {
            return null;
        }
        return data[head];
    }
}
