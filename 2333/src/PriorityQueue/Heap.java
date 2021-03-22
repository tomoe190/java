package PriorityQueue;

public class Heap {
    // 向下调整，要求当前被调整节点的左右子树都已经是堆了
    // size --> 当前数组的有效元素大小
    // index --> 从这个位置开始调整
    // 大堆
    public void shiftDown(int[] arr,int size,int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while (child < parent) {
            if (child + 1 < size && arr[child + 1] > arr[child]) {
                child = child + 1;
            }
            if (arr[child] > arr[parent]) {
                int tmp = arr[parent];
                arr[parent] = arr[child];
                arr[child] = tmp;
            } else {
                // 调整完毕
                break;
            }
        parent = child;
        child = 2 * parent + 1;
    }
}

// 建堆操作
    public void createHeap(int[] array) {
        // 从后往前遍历数组，针对每个下标都去进行向下调整
        // 从最后一个叶子节点的父节点（最后一个非叶子节点）
        for (int i = (array.length - 1 - 1) / 2; i >= 0; i--) {
            shiftDown(array, array.length, i);
        }
    }
}
