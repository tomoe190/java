package homework;

import java.util.Arrays;

public class Day04 {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int end = s.length() - 1;
        while (s.charAt(end) == ' ') {
            end --;
        }
        int start = end;
        while (s.charAt(start) != ' ') {
            start --;
        }
        return end - start;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            nums1[p--] = (nums1[p1] > nums2[p2])? nums1[p1--] : nums2[p2--];
        }
        System.arraycopy(nums2,0,nums1,0,p2 + 1);
    }

    private float f = 1.0f;
    int m = 12;
    static int n = 1;
    public static void main (String[] args) {
        Day04 t = new Day04();
        t.f = 0.0f;
        t.m = 10;
        Day04.n = 3;

    }

//    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {1,4,7};
//        merge(nums1,3,nums2,3);
//        System.out.println(Arrays.toString(nums1));
//    }
}
