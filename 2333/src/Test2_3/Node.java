package Test2_3;

public class Node {
    public int val;
    public Node next = null;

    public Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "[" + val +"]";
    }
}
