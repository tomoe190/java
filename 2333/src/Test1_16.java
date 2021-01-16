import java.util.Arrays;

public class Test1_16 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
//        int[] result = copyOf(arr);
//        int[] result = Arrays.copyOf(arr,arr.length);
//        System.out.println(Arrays.toString(result));
//        result[0] = 100;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(result));

//        int[] arr = {4,2,5,3,8};
//        int maxValue = max(arr);
//        System.out.println(maxValue);
//        double avgValue = avg(arr);
//        System.out.println(avgValue);
//        int searchResult = search(arr,7);
//        System.out.println(searchResult);
//        int[] a = {1,2,3,5,7,9,11,15,18,21};
        int[] a = makeBigArray();
        int pos = binarySearch(a,9999);
        System.out.println(pos);
    }

    public static int[] makeBigArray(){
        int[] a = new int[10000];
        for (int i = 0; i <a.length ; i++) {
            a[i] = i;
        }
        return a;
    }

    public static int binarySearch(int[] a, int toSearch) {
        int count = 0;
        int left = 0;
        int right = a.length - 1;
        while (left <= right ) {
            count++;
            int mid = left + right / 2;
            if( toSearch > a[mid] ){
                left = mid + 1;
            }else if( toSearch < a[mid]){
                right = mid -1;
            }else{
                System.out.println("count:" + count);
                return mid;
            }
        }
        System.out.println("count:" + count);
        return -1;
    }

    public static int search(int[] arr, int toSearch) {
        int index = 0;
        for (index = 0; index <arr.length ; index++) {
            if(toSearch == arr[index]){
                return index;
            }
        }
        System.out.println("找不到该数。");
        return -1;
    }

    public static double avg(int[] arr) {
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        return  (double) sum/ arr.length;

    }

    public static int max(int[] arr) {
        int result = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > result){
                result = arr[i];
                arr[i] = result;
            }
        }
        return result;
    }

    public static int[] copyOf(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
