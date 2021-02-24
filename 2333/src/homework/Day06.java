package homework;

import java.util.Arrays;

public class Day06 {
//    public static int[] sortedSquares(int[] nums) {
//        for (int i = 0 ; i < nums.length; i ++) {
//            nums[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;
//    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int pos = nums.length - 1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (-nums[left] > nums[right]) {
                result[pos] = nums[left] * nums[left];
                left ++;
            } else {
                result[pos] = nums[right] * nums[right];
                right --;
            }
            pos --;
        }
        return result;
    }

    public static String reverseOnlyLetters(String S) {
        StringBuilder stringBuilder = new StringBuilder();
        int pos = S.length() - 1;
        for (int i = 0; i < S.length(); i++) {
            if (Character.isLetter(S.charAt(i))){
                while (!Character.isLetter(S.charAt(pos))) {
                    pos --;
                }
                stringBuilder.append(S.charAt(pos--));
            } else {
                stringBuilder.append(S.charAt(i));
            }
        }
        return stringBuilder.toString();
    }


        public static void main(String[] args) {
//        int[] nums = {-4,-2,1,2,3,5};
//        int[] result = sortedSquares(nums);
//        System.out.println(Arrays.toString(result));

            String S = "-s,a-faf-AGEW-AG-ffsyyy-";
            System.out.println(S);
            String result = reverseOnlyLetters(S);
            System.out.println(result);
    }
}
