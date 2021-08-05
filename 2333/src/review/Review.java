package review;

import ArrayList.OJ.ListNode;

import java.util.Arrays;

public class Review {

    // 删除链表中等于给定值的节点
    public static ListNode removeElements(ListNode head,int val){
        if (head == null) {
            return null;
        }
        for (ListNode cur = head; cur != null ; cur = cur.next) {
            if (cur.next.val == val){
                ListNode toDelete = cur.next;
                cur.next = toDelete.next;
            }
        }
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }

    public static void insertSort(int[] arr) {
        int bound = 1;
        for (;bound < arr.length;bound ++) {
            int cur = bound - 1;
            int v = arr[bound];
            for (;cur >= 0;cur --) {
                if (arr[cur] > v) {
                    arr[cur + 1] = arr[cur];
                } else {
                    break;
                }
            }
            arr[cur + 1] = v;
        }
    }

    public static void selectSort(int[] arr) {
        int bound = 0;
        for (;bound < arr.length; bound ++) {
            int cur = bound + 1;
            for (;cur < arr.length;cur ++) {
                if (arr[cur] < arr[bound]) {
                    swap(arr,cur,bound);
                }
            }
        }
    }

    public static void heapSort(int[] arr) {
        int size = arr.length;
        createHeap(arr);
        for (int i = 0;i < arr.length;i ++) {
            swap(arr,0,size - 1);
            size --;
            shiftDown(arr,size,0);
        }
    }

    public static void createHeap(int[] arr) {
        for (int i = (arr.length-1-1)/2; i >= 0; i--) {
            shiftDown(arr,arr.length,i);
        }
    }

    public static void shiftDown(int[] arr,int size,int index) {
        int parent = index;
        int child = parent *2 + 1;
        while (child < size) {
            if (child + 1 < size && arr[child + 1] > arr[child]) {
                child = child + 1;
            }
            if (arr[child] > arr[parent]) {
                swap(arr,child,parent);
            }
            parent = child;
            child = parent *2 +1;
        }

    }

    public static void swap(int[] arr,int a,int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,9,3,7,6,8};
//        insertSort(arr);
//        selectSort(arr);
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
