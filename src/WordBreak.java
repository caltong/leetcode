import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}


public class WordBreak {
    public static void main(String[] args) {
        Solution139 solution139 = new Solution139();
        boolean res = solution139.wordBreak("leetcode", Arrays.asList("leet", "code"));
        System.out.println(res);
    }
}
