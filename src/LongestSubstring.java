import java.util.*;

class Solution395 {
    public int longestSubstring(String s, int k) {
        if (s.length() < k) return 0;
        Map<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char c : counter.keySet()) {
            if (counter.get(c) < k) {
                int res = 0;
                for (String t : s.split(String.valueOf(c))) {
                    res = Math.max(res, longestSubstring(t, k));
                }
                return res;
            }
        }
        return s.length();
    }
}

public class LongestSubstring {
    public static void main(String[] args) {
        Solution395 solution395 = new Solution395();
        int res = solution395.longestSubstring("bbaaacbd", 3);
        System.out.println(res);
    }
}
