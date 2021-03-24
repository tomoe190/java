package PriorityQueue;

public class Heap {
    // 向下调整，要求当前被调整节点的左右子树都已经是堆了
    // size --> 当前数组的有效元素大小
    // index --> 从这个位置开始调整
    // 大堆
    public void shiftDown(int[] arr,int size,int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while (child < size) {
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

    // 向上调整
    public void shiftUp(int[] arr,int size,int index) {
        int child = index;
        int parent = (child - 1) / 2;
        while (child > 0) {
            if(arr[child] > arr[parent]) {
                int tmp = arr[parent];
                arr[parent] = arr[child];
                arr[child] = tmp;
            } else {
                break;
            }
            child = parent;
            parent = (child - 1) / 2;
        }
    }

    // 建堆操作1
    public void createHeap(int[] array) {
        // 从后往前遍历数组，针对每个下标都去进行向下调整
        // 从最后一个叶子节点的父节点（最后一个非叶子节点）
        for (int i = (array.length - 1 - 1) / 2; i >= 0; i--) {
            shiftDown(array, array.length, i);
        }
    }

    private int[] arr = new int[100];
    private int size = 0;

    // 插入元素
    public void offer(int val) {
        if (size > arr.length) {
            return ;
        }
        arr[size] = val;
        size ++;
//        int child = size - 1;
//        int parent = (child - 1) / 2;
//        while (child > 0) {
//            if (arr[child] > arr[parent]) {
//                int tmp = arr[child];
//                arr[child] = arr[parent];
//                arr[parent] = arr[child];
//            } else {
//                break;
//            }
//            child = parent;
//            parent = (child - 1) / 2;
//        }
        shiftUp(arr,size,size - 1);
    }

    // 创建堆操作2
    public void createHeap2(int[] arr) {
        for(int x : arr) {
            offer(x);
        }

    }

    // 取堆顶元素
    public Integer peek() {
        if (size == 0) {
            return null;
        }
        return arr[0];
    }

    // 删除操作(一定是删除堆顶元素)
    public Integer poll() {
        if(size == 0) {
            return null;
        }
        int ret = arr[0];
        int tmp = arr[0];
        arr[0] = arr[size - 1];
        arr[size - 1] = tmp;
        size --;
        shiftDown(arr,size,0);
        return ret;
    }


}
