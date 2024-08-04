package dfs;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> permute(String s) {
        List<String> res = new ArrayList<>();
        boolean[] visited = new boolean[s.length()];
        dfs(s, res, 0, "", visited);
        return res;
    }

    public void dfs(String s, List<String> res, int index, String temp, boolean[] visited) {
        if (index == s.length()) {
            res.add(temp);
            return;
        }
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                temp += s.charAt(i);
                visited[i] = true;
                dfs(s, res, index + 1, temp, visited);
                visited[i] = false;
                temp = temp.substring(0, temp.length() - 1);
            }
        }
    }
}


public class Offer38 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> res = solution.permute("abc");
        System.out.println(res);
    }
}
