package homework;

public class Day03 {
    public static boolean canConstruct3(String ransomNote, String magazine) {
        int[] r = new int[26];
        int[] m = new int[26];
        for (char c : ransomNote.toCharArray()) {
            r[c - 'a'] += 1;
        }
        for (char c : magazine.toCharArray()) {
            m[c - 'a'] += 1;
        }
        for (int i = 0; i < 25; i++) {
            if (r[i] > m[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x >0 && x % 10 == 0)) {
            return false;
        }
        int reverseNum = 0;
        while (x > reverseNum) {
            reverseNum = reverseNum * 10 + x % 10;
            x /= 10;
        }
        if (x == reverseNum) {
            return true;
        }
        if (x == (reverseNum / 10)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String ransomNote = "bcadaac";
        String magazine = "bbefgcdacadc";
        System.out.println(canConstruct3(ransomNote,magazine));
    }
}
