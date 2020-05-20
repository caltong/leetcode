import java.util.Arrays;

class Solution1371 {
    public int findTheLongestSubstring(String s) {
        int len = s.length();
        int[] pos = new int[1 << 5];
        Arrays.fill(pos, -1);
        int ans = 0;
        int status = 0;
        pos[0] = 0;
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == 'a') {
                status ^= (1 << 0);
            } else if (ch == 'e') {
                status ^= (1 << 1);
            } else if (ch == 'i') {
                status ^= (1 << 2);
            } else if (ch == 'o') {
                status ^= (1 << 3);
            } else if (ch == 'u') {
                status ^= (1 << 4);
            }
            if (pos[status] >= 0) {
                ans = Math.max(ans, i + 1 - pos[status]);
            } else {
                pos[status] = i + 1;
            }
        }
        return ans;
    }
}

public class FindTheLongestSubstring {
    public static void main(String[] args) {
        Solution1371 solution1371 = new Solution1371();
        int res = solution1371.findTheLongestSubstring("eleetminicoworoep");
        System.out.println(res);
    }
}
