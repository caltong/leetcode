class Solution680 {
    private boolean isPalindromeRange(String s, int i, int j) {
        for (int k = 0; k <= (j - i) / 2; k++) {
            if (s.charAt(k + i) != s.charAt(j - k)) {
                return false;
            }
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindromeRange(s, i + 1, j) || isPalindromeRange(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }
}

public class ValidPalindrome {
    public static void main(String[] args) {
        Solution680 solution680 = new Solution680();
        boolean res = solution680.validPalindrome("abc");
        System.out.println(res);
    }
}
