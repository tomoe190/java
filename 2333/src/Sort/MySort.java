package Sort;

import java.util.Arrays;

public class MySort {
    public static void insertSort(int[] arr) {
        // 划分“已排区间” 和 “待排区间”
        int bound = 1;
        for (; bound < arr.length; bound ++) {
            int v = arr[bound];
            int cur = bound - 1;
            for (; cur >= 0; cur --) {
                if (arr[cur] > v) {
//                    int tmp = arr[cur];
//                    arr[cur] = v;
//                    v = tmp;
                    arr[cur + 1] = arr[cur];
                } else {
                    break;
                }
            }
            arr[cur + 1] = v;
        }
    }

    public static void shellSort(int[] arr) {
        int gap = arr.length / 2;
        while (gap >= 1) {
            _shellSort(arr,gap);
            gap = gap / 2;
        }
    }

    public static void _shellSort(int[] arr,int gap) {
        int bound = gap;
        for (; bound < arr.length ; bound++) {
            int v = arr[bound];
            int cur = bound - gap;
            for (; cur >= 0 ; cur = cur - gap) {
                if (arr[cur] > v) {
                    arr[cur + gap] = arr[cur];
                } else {
                    break;
                }
            }
            arr[cur + gap] = v;
        }
    }

    public static void selectOrder(int[] arr) {
        int bound = 0;
        for (;bound < arr.length; bound ++) {
            for (int cur = bound + 1; cur < arr.length; cur++) {
                if (arr[cur] < arr[bound]) {
                    swap(arr,cur,bound);
                }
            }
        }
    }

    public static void swap (int[] arr,int cur,int bound) {
        int tmp = arr[cur];
        arr[cur] = arr[bound];
        arr[bound] = tmp;
    }

    public static void heapSort(int[] arr) {
        createHeap(arr);
        int heapSize = arr.length;
        for (int i = 0; i < arr.length; i++) {
            // 交换堆上的 第一个和最后一个元素
            // 注意堆的最后一个元素并不是每次都是数组的最后一个元素
            swap(arr,0,heapSize - 1);
            // 删除堆的最后一个元素，但是它还存在在数组中
            heapSize --;
            // 只用调整一次，因为其本身已经是堆，只是交换后的第一个元素需要调整
            shiftDown(arr,heapSize,0);
        }
    }

    private static void createHeap(int[] arr) {
        for (int i = ((arr.length - 1) - 1 ) / 2; i >= 0 ; i--) {
            shiftDown(arr,arr.length,i);
        }
    }

    public static void shiftDown(int[] arr,int size,int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while (child < size) {
            if (child + 1 < size && arr[child + 1] > arr[child]) {
                child = child + 1;
            }
            if (arr[child] > arr[parent]) {
                swap(arr,child,parent);
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,7,2,5,6,9,1};
//        insertSort(arr);
//        shellSort(arr);
//        selectOrder(arr);
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
