package homework;

import java.util.Arrays;

public class Day01 {
    public static String toLowerCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str.toCharArray())  {
            if (c >= 'A' && c <= 'Z'){
                stringBuilder.append((char)(c + 32));
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums,0,nums.length - 1);
        reverse(nums,0,k - 1);
        reverse(nums,k,nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start ++;
            end --;
        }
    }

    public static void main(String[] args) {
//        String str = "HeLlo";
//        String result = toLowerCase(str);
//        System.out.println(result);
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        rotate(nums,8);
    }
}
