import java.util.Arrays;

class Solution132 {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] g = new boolean[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(g[i], true);
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j; i++) {
                g[i][j] = (s.charAt(i) == s.charAt(j)) & (g[i + 1][j - 1]);
            }
        }

        int[] f = new int[n];
        Arrays.fill(f, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            if (g[0][i]) {
                f[i] = 0;
            } else {
                for (int j = 0; j < i; j++) {
                    if (g[j + 1][i]) {
                        f[i] = Math.min(f[i], f[j] + 1);
                    }
                }
            }
        }

        return f[n - 1];
    }
}


public class MinCut {
    public static void main(String[] args) {
        Solution132 solution132 = new Solution132();
        int res = solution132.minCut("aab");
        System.out.println(res);
    }
}
