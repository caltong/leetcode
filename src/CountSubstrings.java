class Solution647 {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                if (help(s.substring(i, j))) {
                    count += 1;
                }
            }
        }
        return count;
    }

    private boolean help(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }
}

public class CountSubstrings {
    public static void main(String[] args) {
        Solution647 solution647 = new Solution647();
        int res = solution647.countSubstrings("aaa");
        System.out.println(res);
    }
}
