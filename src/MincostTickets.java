import java.util.HashSet;
import java.util.Set;

class Solution983 {
    int[] costs;
    Integer[] memo;
    Set<Integer> daySet;

    public int mincostTickets(int[] days, int[] costs) {
        this.costs = costs;
        memo = new Integer[366];
        daySet = new HashSet<>();
        for (int day : days) {
            daySet.add(day);
        }
        return dp(1);
    }

    private int dp(int i) {
        if (i > 365) {
            return 0;
        }
        if (memo[i] != null) {
            return memo[i];
        }
        if (daySet.contains(i)) {
            memo[i] = Math.min(Math.min(dp(i + 1) + costs[0], dp(i + 7) + costs[1]), dp(i + 30) + costs[2]);
        } else {
            memo[i] = dp(i + 1);
        }
        return memo[i];
    }
}

public class MincostTickets {
    public static void main(String[] args) {
        Solution983 solution983 = new Solution983();
        int res = solution983.mincostTickets(new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15});
        System.out.println(res);
    }
}
