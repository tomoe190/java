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


    public int myAtoi (String s) {
        int len = s.length();
        char[] charArray = s.toCharArray();

        int index = 0;
        while (charArray[index] == ' ') {
            index ++;
        }

        if (index == len) {
            return 0;
        }

        int sign = 1;
        char firstChar = charArray[index];
        if (firstChar == '+') {
            index ++;
        } else if (firstChar == '-') {
            index ++;
            sign = -1;
        }

        int res = 0;
        while (index < len) {
            char curChar = charArray[index];

            if (curChar < '0' || curChar > '9') {
                break;
            }

            if (res > Integer.MAX_VALUE / 10 ||
                    (res == Integer.MAX_VALUE / 10 && (curChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }

            if (res < Integer.MIN_VALUE / 10 ||
                    (res == Integer.MIN_VALUE / 10 && (curChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + sign * (curChar - '0');
            index ++;
        }
        return res;
    }
}
