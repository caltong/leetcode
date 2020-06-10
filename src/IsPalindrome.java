class Solution9 {
    boolean isPalindrome(int x) {
        long tmp = 0;
        long bak = x;
        if (x < 0) {
            return false;
        }
        while (x != 0) {
            tmp = tmp * 10 + x % 10;
            x = x / 10;
        }
        return tmp == bak;
    }
}

public class IsPalindrome {
    public static void main(String[] args) {
        Solution9 solution = new Solution9();
        System.out.println(solution.isPalindrome(12345432));
    }
}
