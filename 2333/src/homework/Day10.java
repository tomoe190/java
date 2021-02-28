package homework;

public class Day10 {
    public int[] searchRange(int[] nums, int target) {
        int l = search(nums,target);
        int r = search(nums,target + 1);
        if (l == nums.length || nums[l] != target) {
            return new int[]{-1,-1};
        }
        return new int[]{l,r - 1};
    }

    public int search(int[] nums,int target) {
        int left = 0;
        int right = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
