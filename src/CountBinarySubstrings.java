class Solution696 {
    public int countBinarySubstrings(String s) {
        int last = 0;
        int now = 1;
        int count = 0;
        int len = s.length();
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                now += 1;
            } else {
                count += Math.min(last, now);
                last = now;
                now = 1;
            }
        }
        count += Math.min(last, now);
        return count;
    }
}

public class CountBinarySubstrings {
    public static void main(String[] args) {
        Solution696 solution696 = new Solution696();
        int res = solution696.countBinarySubstrings("00110011");
        System.out.println(res);
    }
}
