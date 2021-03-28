package Sort;

import java.util.Arrays;
import java.util.Stack;

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

    public static void bubbleSort(int[] arr) {
        for (int bound = 0; bound < arr.length; bound++) {
            for (int cur = arr.length - 1; cur > bound ; cur--) {
                if (arr[cur - 1] > arr[cur]) {
                    swap(arr,cur - 1,cur);
                }
            }
        }
    }

    public static void quickSort(int[] arr) {

        _quickSort(arr,0,arr.length - 1);
    }

    public static void _quickSort(int[] arr,int left,int right) {
        if (left >= right) {
            return;
        }
        // index 表示基准值所在的位置
        int index = partition(arr,left,right);
        _quickSort(arr,left,index - 1);
        _quickSort(arr,index + 1,right);
    }

    public static int partition(int[] arr,int left,int right) {
        int v = arr[right];
        int l = left;
        int r = right;
        while (l < r) {
            while (l < r && arr[l] <= v) {
                l ++;
            }
            while (l < r && arr[r] >= v) {
                r --;
            }
            swap(arr,l,r);
        }
        swap(arr,l,right);
        return l;
    }

    public static void quickSortByLoop(int[] arr) {
//        // 1、创建一个栈用来保存当前的每一个待处理区间
//        Stack<Integer> stack = new Stack<>();
//        // 2、把根节点入栈，整个数组对应的区间
//        stack.push(0);
//        stack.push(arr.length - 1);
//        // 3、循环取栈顶元素
//        while (!stack.isEmpty()) {
//            // 取的元素就是当前的待处理区间
//            int right = stack.pop();
//            int left = stack.pop();
//            if (left >= right) {
//                // 如果是空区间或只有一个元素，不需要排序
//                continue;
//            }
//            // 调用partition 方法整理当前区间
//            int index = partition(arr,left,right);
//            // 右侧区间：[index + 1,right]
//            stack.push(index + 1);
//            stack.push(right);
//            // 左侧区间：[left,index - 1]
//            stack.push(left);
//            stack.push(index - 1);
//        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(arr.length - 1);
        while (!stack.isEmpty()) {
            int right = stack.pop();
            int left = stack.pop();
            if (left >= right) {
                return ;
            }
            int index = partition(arr,left,right);
            stack.push(index + 1);
            stack.push(right);
            stack.push(left);
            stack.push(index - 1);
        }
    }

    public static void mergeSort(int[] arr) {
        _mergeSort(arr,0,arr.length);
    }

    public static void _mergeSort(int[] arr,int left,int right) {
        if (right - left <= 1) {
            // 判定当前区间是不是只有一个元素或者没有元素
            // 此时不需要进行排序
            return ;
        }
        int mid = (left + right) / 2;
        // 先让 [left, mid) 区间变成有序
        _mergeSort(arr,left,mid);
        // 再让 [mid,right) 区间变成有序
        _mergeSort(arr,mid,right);
        // 合并两个有序区间
        merge(arr,left,mid,right);
    }

    // 归并中的关键操作，就是归并两个有序数组
    // 使用该方法完成数组归并的过程
    // 此处两个数组就通过参数的 left,mid,right 描述
    // [left, mid) 左侧数组
    // [mid,right) 右侧数组
    public static void merge(int[] arr,int left,int mid,int right) {
        // 创建一个临时空间来保存归并的结果
        // 临时空间得能保存的下待归并的两个数组
        // right - left这么长
        int[] tmp = new int[right - left];
        // 这个下标表示当前元素放到临时空间的哪个位置
        int tmpIndex = 0;
        int cur1 = left;
        int cur2 = mid;
        while (cur1 < mid && cur2 < right) {
            if(arr[cur1] <= arr[cur2]) {
                tmp[tmpIndex] = arr[cur1];
                tmpIndex ++;
                cur1 ++;
            } else {
                tmp[tmpIndex] = arr[cur2];
                tmpIndex ++;
                cur2 ++;
            }
        }
        // 循环结束后，需要把剩余元素也都拷贝到最终结果里
        while (cur1 < mid) {
            tmp[tmpIndex] = arr[cur1];
            tmpIndex ++;
            cur1 ++;
        }
        while (cur2 < right) {
            tmp[tmpIndex] = arr[cur2];
            tmpIndex ++;
            cur2 ++;
        }
        // h还需要把 tmp 的结果再放回 arr 数组 （原地排序）
        for (int i = 0; i < tmp.length; i++) {
//            arr[left] = tmp[i];
//            left ++;
            arr[left + i] = tmp[i];
        }
    }

    public static void mergeSortByLoop(int[] arr) {
        // 控制每个分组的长度，每个待归并数组的长度
        int gap = 1;
        for(;gap < arr.length;gap *= 2) {
            for (int i = 0; i < arr.length; i += 2*gap) {
                // 控制两个相邻数组归并
                int left = i;
                int mid = i + gap;
                int right = i + 2 * gap;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {8,7,2,5,6,9,1};
//        insertSort(arr);
//        shellSort(arr);
//        selectOrder(arr);
//        heapSort(arr);
//        bubbleSort(arr);
//        quickSort(arr);
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
