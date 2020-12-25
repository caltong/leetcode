import sun.java2d.pipe.SolidTextRenderer;

import java.util.Arrays;

class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int score = 0;
        int gIndex = 0;
        int sIndex = 0;
        while (gIndex < g.length && sIndex < s.length) {
            if (g[gIndex] <= s[sIndex]) {
                score += 1;
                gIndex += 1;
                sIndex += 1;
            } else {
                sIndex += 1;
            }
        }
        return score;
    }
}

public class FindContentChildren {
    public static void main(String[] args) {
        Solution455 solution455 = new Solution455();
        System.out.println(solution455.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 3}));
    }
}
