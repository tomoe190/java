package homework;

import java.util.Arrays;

public class Day05 {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLongPressedName(String name, String typed) {
        int i = 0,j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i ++;
                j ++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j ++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }

    public static void main(String[] args) {
//        int[] nums = {21,1,2,5,4,6,7,8,9};
//        System.out.println(containsDuplicate(nums));

        String name = "allen";
        String typed = "allleeedn";
        System.out.println(isLongPressedName(name,typed));
    }
}
