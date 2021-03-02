package homework;

public class Day12 {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int min = nums[len - 1];
        int start = 0,end = -1;
        for (int i = 0; i < len; i++) {
            if (nums[i] < max) {
                end = i;
            } else {
                max =nums[i];
            }

            if (nums[len - 1 - i] > min) {
                start = len - 1 - i;
            } else {
                min = nums[len - 1 - i];
            }
        }
        return end - start + 1;
    }
}
