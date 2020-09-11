import java.util.ArrayList;
import java.util.List;

class Solution216 {
    List<Integer> temp = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        for (int mask = 0; mask < (1 << 9); ++mask) {
            if (check(mask, k, n)) {
                ans.add(new ArrayList<>(temp));
            }
        }
        return ans;
    }

    private boolean check(int mask, int k, int n) {
        temp.clear();
        for (int i = 0; i < 9; ++i) {
            if (((1 << i) & mask) != 0) {
                temp.add(i + 1);
            }
        }
        if (temp.size() != k) {
            return false;
        }
        int sum = 0;
        for (int num : temp) {
            sum += num;
        }
        return sum == n;
    }
}

public class CombinationSum3 {
    public static void main(String[] args) {
        Solution216 solution216 = new Solution216();
        List<List<Integer>> res = solution216.combinationSum3(3, 7);
        System.out.println(res);
    }
}
