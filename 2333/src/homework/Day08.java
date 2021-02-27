package homework;

import java.util.Arrays;

public class Day08 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (long num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num > third && num <second) {
                third = num;
            }
        }
        return (int)(third == Long.MIN_VALUE ? first : third);
    }

    public static void main(String[] args) {
        int[] digits = {9,2,9,1,9};
        System.out.println(Arrays.toString(plusOne(digits)));
        int[] nums = {3,1,1};
        System.out.println(thirdMax(nums));
    }
}
