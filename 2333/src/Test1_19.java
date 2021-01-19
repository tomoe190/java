import javafx.scene.effect.ImageInput;

import java.util.Arrays;

public class Test1_19 {
//    public static void main(String[] args) {
//        String str = "hello";
//        String str2 = new String("hello");
//        char[] array = {'a','b','c'};
//        String str3 = new String(array);
//    }

//    class Test {
//        public static void hello() {
//            System.out.println("hello");
//        }
//    }
//
//        public static void main(String[] args) {
//            // TODO Auto-generated method stub
//            Test1_19 test=null;
//            test.hello();
//        }


//    static boolean Paddy;
//    public static void main(String args[]){
//        System.out.println(Paddy);
//    }

//    private static int x = 100;// 2
//    public static void main(String args[]) {// 3
//        Test1_19 hsl = new Test1_19();// 4
//        hsl.x++;// 5
//        Test1_19 hs2 = new Test1_19();// 6
//        hs2.x++;// 7
//        hsl = new Test1_19();// 8
//        hsl.x++;// 9
//        Test1_19.x--;// 10
//        System.out.println(" x=" + x);// 11
//    }

//    private int count;
//
//    public static void main(String[] args) {
//
//        Test1_19 test=new Test1_19(88);
//
//        System.out.println(test.count);
//
//    }
//
//    Test1_19(int a) {
//
//        count=a;
//
//    }


//        public String toString() {
//            System.out.print("aaa");
//            return "bbb";
//        }

//    private float f=1.0f;
//    int m=12;
//    static int n=1;
//    public static void main(String args[]){
//        Test1_19 t=new Test1_19();
//    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,4,9,1,10,8};
        int[] arr2 = {1,2,3,4,5,6,7};
        exchange(arr,arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));

//        int[] arr = {9,5,2,7,3,6};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        //从后往前遍历
        //外层循环遍历的次数
        //已排区间[0，bound）
        //待排区间[bound，length）
        for (int bound = 0; bound < arr.length; bound++) {
            //里层循环，比较交换
            for (int cur = arr.length - 1; cur > 0; cur--) {
                if (arr[cur - 1] > arr[cur]) {
                    //不符合排序要求
                    int tmp = 0;
                    tmp = arr[cur - 1];
                    arr[cur - 1] = arr[cur];
                    arr[cur] = tmp;
                }
            }
        }
    }

        private static void exchange(int[] arr, int[] arr2) {
        for (int i = 0; i < arr.length; i++) {
            int[] tmp = arr;
            arr = arr2;
            arr2 = tmp;
        }
    }

    private static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            while(left < right && arr[left] % 2 == 0){
                left++;
            }
            while(left < right && arr[right] % 2 != 0){
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }

}