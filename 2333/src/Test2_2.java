public class Test2_2 {
    public static void main(String[] args) {
//        int[] arr = {1,3,5,8,9,10,12,131,410};
//        int index = binarySearch(arr,10);
//        System.out.println(index);
        int num = fibonacci(5);
        System.out.println(num);
    }

//    public static void bubbleSort(int[] array) {
//        for (int end = array.length; end > 0; end--) {
//            boolean sorted = true;
//            for (int i = 1; i < end; i++) {
//                if (array[i - 1] > array[i]) {
//                    Swap(array, i - 1, i);
//                    sorted = false;
//                }
//            }
//            if (sorted == true) {
//                break;
//            }
//        }
//    }

    public static int fibonacci(int N) {
        if (N <= 2) {
            return 1;
        }
        return fibonacci(N - 1) + fibonacci(N - 2);
    }

    public static int binarySearch(int[] arr,int toSearch) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(toSearch > arr[mid]){
                left = mid + 1;
            }
            else if(toSearch < arr[mid]) {
                right = mid -1;
            }else
                return mid;
        }
        return -1;
    }
}
