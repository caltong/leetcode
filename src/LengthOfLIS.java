import java.util.Arrays;

class Solution300 {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    max = Math.max(dp[i], max);
                }
            }
        }
        return max;
    }
}

public class LengthOfLIS {
    public static void main(String[] args) {
        Solution300 solution300 = new Solution300();
        int res = solution300.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
        System.out.println(res);
    }
}
