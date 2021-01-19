

import java.util.Arrays;

public class Test1_17 {
    static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main(String[] args){
        System.out.println("cnt =" + cnt);
    }
    static{
        cnt /=3;
    };



//            System.out.println(new Test1_19());

//        int[] arr = {1,1,2,2,5,5,12,12,8,4,4,6,6};
//        int onlyOneNumber = onlyOne(arr);
//        System.out.println(onlyOneNumber);

//        int[] arr = {2,3,5,1,11,6,8};
//        double avgValue = avg(arr);
//        System.out.println(avgValue);
//        int sumOfAll = sum(arr);
//        System.out.println(sumOfAll);
//        transform(arr);
//        System.out.println(Arrays.toString(arr));
//        printArray(arr);
//        int[] arr = makeArray();
//        System.out.println(Arrays.toString(arr));
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));

//        int[] arr = {0,2,3,4,10,8,9};
//        System.out.println(isIncrease(arr));

//        int[] arr = {2,3,6,10,11,18,21,44,56,81,99};
////        int index = searchNumber(arr,11);
////        System.out.println(index);
////        int[] arr2 = copyOf(arr);
////        System.out.println(Arrays.toString(arr2));
//
//        String arrToString = toString(arr);
//        System.out.println(arrToString);


    private static String toString(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i != arr.length - 1) {
                result += ",";
            }
        }
        result += "]";
        return result;
    }

    private static int[] copyOf(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    private static int searchNumber(int[] arr, int toSearch) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(toSearch < arr[mid]){
                right = mid -1;
            }else if(toSearch > arr[mid]){
                left = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    private static boolean isIncrease(int[] arr) {
        for (int i = 0; i <arr.length - 1 ; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length - i - 1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int tmp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    private static int[] makeArray() {
        int[] newArray = new int[100];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i + 1;
            }
        return newArray;
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }

    private static void transform(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static double avg(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return (double)sum / arr.length;
    }


    private static int onlyOne(int[] arr) {
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i] == arr[j]){
                    count ++;
                }
            }
            if(count == 1){
                return arr[i];
            }
            count = 0;
        }
        return -1;
    }


//    public static void main(String[] args) {
//        int[] arr = {8,5,4,2,3,6,11,9};
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    private static void reverse(int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//        while(left < right){
//            while(left < right && arr[left] % 2 != 0){
//                left ++;
//            }
//            while(left < right && arr[right] % 2 == 0){
//                right --;
//            }
//
//            if (left < right) {
//                int tmp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = tmp;
//            }
//        }
//    }
}
