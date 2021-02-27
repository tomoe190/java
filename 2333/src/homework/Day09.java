package homework;

import java.util.Arrays;

public class Day09 {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target && i != j) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int tmp = 0;
        for (int i = a.length() - 1, j = b.length();i >= 0 || j >= 0;i--,j--) {
            int sum = tmp;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            stringBuilder.append(sum % 2);
            tmp = sum / 2;
        }
        tmp == 1 ? tmp : "";
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 13)));
    }

}
