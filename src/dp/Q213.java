package dp;

public class Q213 {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length - 1; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        int dp1 = dp[nums.length - 2];
        dp[0] = 0;
        dp[1] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        int dp2 = dp[nums.length - 1];
        return Math.max(dp1, dp2);
    }

    public static void main(String[] args) {
        Q213 q213 = new Q213();
        int res = q213.rob(new int[]{2, 1, 1, 2});
        System.out.println(res);
    }
}
