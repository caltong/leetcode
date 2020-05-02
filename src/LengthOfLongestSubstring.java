import java.util.HashSet;
import java.util.Set;

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> occ = new HashSet<>();
        int len = s.length();
        int right = -1;
        int res = 0;
        for (int i = 0; i < len; i++) {
            if (i != 0) {
                occ.remove(s.charAt(i - 1));
            }
            while (right + 1 < len && !occ.contains(s.charAt(right + 1))) {
                occ.add(s.charAt(right + 1));
                right += 1;
            }
            res = Math.max(res, right - i + 1);
        }
        return res;
    }
}

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int res = solution3.lengthOfLongestSubstring("abc");
        System.out.println(res);
    }
}
