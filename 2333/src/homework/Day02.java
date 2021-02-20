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

        public boolean canConstruct(String ransomNote, String magazine) {
            char[] chars1 = ransomNote.toCharArray();
            char[] chars2 = magazine.toCharArray();
            if (chars1.length > chars2.length) {
                return false;
            }
            int[] rans = new int[26];
            int[] maga = new int[26];
            for (char c : chars1) {
                rans[c - 'a']++;
            }
            for (char c : chars2) {
                maga[c - 'a']++;
            }
            for (int i = 0; i < rans.length ; i++) {
                if (rans[i] > maga[i]) {
                    return false;
                }
            }
            return true;
        }


    public static void main(String[] args) {
//        int[] nums = {1,2,3,1,0,1,1,1,6,8};
//        int result = removeElement(nums,1);
//        System.out.println(result);
        int[] nums = {1,2,4,5,7,8,9};
        int index = searchInsert(nums,6);
        System.out.println(index);
    }
}
