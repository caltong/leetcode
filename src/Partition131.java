import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution131 {
    boolean[][] f;
    List<List<String>> ret = new ArrayList<>();
    List<String> ans = new ArrayList<>();
    int n;

    public List<List<String>> partition(String s) {
        n = s.length();
        f = new boolean[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(f[i], true);
        }

        for (int i = n - 1; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                f[i][j] = (s.charAt(i) == s.charAt(j)) && f[i + 1][j - 1];
            }
        }

        dfs(s, 0);
        return ret;
    }

    public void dfs(String s, int i) {
        if (i == n) {
            ret.add(new ArrayList<>(ans));
            return;
        }
        for (int j = i; j < n; ++j) {
            if (f[i][j]) {
                ans.add(s.substring(i, j + 1));
                dfs(s, j + 1);
                ans.remove(ans.size() - 1);
            }
        }
    }
}

public class Partition131 {
    public static void main(String[] args) {
        Solution131 solution131 = new Solution131();
        List<List<String>> res = solution131.partition("aab");
        for (List<String> list : res) {
            System.out.println(list);
        }
    }
}
