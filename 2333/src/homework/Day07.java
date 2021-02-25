package homework;

import java.util.Arrays;

public class Day07 {
    public static int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            while (A[left] % 2 == 0 && left < right) {
                left ++;
            }
            while (A[right] % 2 != 0 && left < right) {
                right --;
            }
            int tmp = A[left];
            A[left] = A[right];
            A[right] = tmp;
        }
        return A;
    }

    public static int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((sum * 2 + nums[i]) == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {3,1,2,4};
//        System.out.println(Arrays.toString(sortArrayByParity(A)));
        System.out.println(pivotIndex(A));

    }

}
