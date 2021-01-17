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
//        int[] a = makeBigArray();
//        int pos = binarySearch(a,9999);
//        System.out.println(pos);



        int[] arr = {9,5,2,7,3,6};
//        bubbleSort(arr);
//        System.out.println(arr);
//        Arrays.sort(arr);
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
        transform2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void transform2(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            //先从左往右找到一个奇数
            while(left<right && arr[left] % 2 ==0){
                left++;
            }
            //从右往左找到一个偶数
            while(left<right && arr[right] % 2 !=0){
                right--;
            }
            //交换left和right
            int tmp =arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }

    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left ++;
            right --;
        }
    }

    public static void bubbleSort(int[] arr) {
        //从后往前遍历
        //外层循环遍历的次数
        //已排区间[0，bound）
        //待排区间[bound，length）
        for (int bound = 0; bound <arr.length ; bound++) {
        //里层循环，比较交换
            for (int cur = arr.length-1; cur >0 ; cur--) {
                if(arr[cur - 1] > arr[cur]){
                    //不符合排序要求
                    int tmp = 0;
                    tmp = arr[cur - 1];
                    arr[cur - 1] = arr[cur];
                    arr[cur] = tmp;
                }
            }
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
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
            int mid = (left + right) / 2;
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
