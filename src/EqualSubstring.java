class Solution1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        int len = s.length();
        int[] diff = new int[len];
        for (int i = 0; i < len; i++) {
            diff[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        int start = 0;
        int end = 0;
        int sum = 0;
        int maxLen = 0;
        while (end < len) {
            sum += diff[end];
            while (sum > maxCost) {
                sum -= diff[start];
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }
        return maxLen;
    }
}

public class EqualSubstring {
    public static void main(String[] args) {
        Solution1208 solution1208 = new Solution1208();
        int res = solution1208.equalSubstring("abcd", "bcdf", 3);
        System.out.println(res);
    }
}
