import java.util.Arrays;

public class Test1_15 {
    public static void main(String[] args) {

//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(arr[i]);
//        }
//        for (int x : arr){
//            System.out.println(x);
//        }
        int[] arr = {1,2,3,4};
        int[] a = arr;
        transform(a);
        int[] result = transform2(a);
        System.out.println(Arrays.toString(arr));
//        System.out.println(arrayToString(arr));
//        System.out.println(arrayToString(result));
//        printArray(arr);
//        printArray(result);

    }
    public static void printArray(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void transform(int[] a){
        a[0] = 100;
    }
    public static int[] transform2(int[] a){
        int[] result = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            result[i] = a[i] * 2;
        }
        return result;
    }
//    public static int[] transform2(int[] a){
//        for (int i = 0; i <a.length ; i++) {
//            a[i] = a[i] * 2;
//        }
//        return a;
//    }
    public static String arrayToString(int[] arr){
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if(i != arr.length-1){
                result +=",";
            }
        }
        result += "]";
        return result;
    }
}
