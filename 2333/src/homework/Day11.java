package homework;

public class Day11 {
    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stringBuilder.append(Character.toLowerCase(ch));
            }
        }
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }

    public static int compress(char[] chars) {     // 数组大小范围： 1 <= chars.length <= 1000
        int left = 0;
        int size = 0;
        for (int right = 0; right <= chars.length; right++) {
            if (right == chars.length || chars[right] != chars[left]) {
                chars[size++] = chars[left];
                if (right - left > 1) {
                    for(char c : String.valueOf(right - left).toCharArray()) {
                        chars[size++] = c;
                    }
                }
                left = right;
            }
        }
        return size;
    }


    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
//        System.out.println(isPalindrome(s));

        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
}
