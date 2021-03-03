package homework;

public class Day12 {
    public static int findUnsortedSubarray(int[] nums) {
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

    public static int evalRPN(String[] tokens) {
        int[] numStack = new int[tokens.length / 2 + 1];
        int index = 0;
        for (String s : tokens) {
            switch (s){
                case "+" :
                    numStack[index - 2] += numStack[-- index];
                    break;
                case "-" :
                    numStack[index - 2] -= numStack[-- index];
                    break;
                case "/" :
                    numStack[index - 2] /= numStack[-- index];
                    break;
                case "*" :
                    numStack[index - 2] *= numStack[-- index];
                    break;
                default:
                    numStack[index ++] = Integer.parseInt(s);
                    break;
            }
        }
        return numStack[0];
    }

    public static void main(String[] args) {
//        String[] s ={"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
//        System.out.println(evalRPN(s));

        int[] nums = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums));
    }
}
