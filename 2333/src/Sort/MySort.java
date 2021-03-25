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
            int cur = arr[bound - gap];
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

    public static void main(String[] args) {
        int[] arr = {8,7,2,5,6,9,1};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
