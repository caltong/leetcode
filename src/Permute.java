import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums, 0, path, used, res);
        return res;
    }

    private void dfs(int[] nums, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (depth == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                path.addLast(nums[i]);
                used[i] = true;
                dfs(nums, depth + 1, path, used, res);
                path.removeLast();
                used[i] = false;
            }

        }
    }
}

public class Permute {
    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        List<List<Integer>> res = solution46.permute(new int[]{1, 2, 3});
        System.out.println(res.toString());
    }
}
