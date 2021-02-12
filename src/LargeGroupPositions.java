import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int len = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (len >= 3) {
                    res.add(Arrays.asList(i - len + 1, i));
                }
                len = 1;
            } else {
                len += 1;
            }
        }
        return res;
    }
}

public class LargeGroupPositions {
    public static void main(String[] args) {
        Solution830 solution830 = new Solution830();
        List<List<Integer>> res = solution830.largeGroupPositions("abcdddeeeeaabbbcd");
        System.out.println(res);
    }
}
