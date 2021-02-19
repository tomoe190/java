package homework;

public class Day02 {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0;j < nums.length;j ++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right)/2;
            if (target < nums[mid]) {
                right = mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,3,1,0,1,1,1,6,8};
//        int result = removeElement(nums,1);
//        System.out.println(result);
        int[] nums = {1,2,4,5,7,8,9};
        int index = searchInsert(nums,11);
        System.out.println(index);
    }
}
