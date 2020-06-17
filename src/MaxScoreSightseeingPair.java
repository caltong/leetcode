class Solution1014 {
    public int maxScoreSightseeingPair(int[] A) {
        int[] dp = new int[A.length];
        dp[0] = 0;
        for (int i = 1; i < A.length; i++) {
            if ((dp[i - 1] - A[i - 1]) < A[i - 1]) {
                dp[i] = A[i - 1] + A[i] - 1;
            } else {
                dp[i] = dp[i - 1] - A[i - 1] + A[i] - 1;
            }
        }
        int max = 0;
        for (int tmp : dp) {
            if (tmp >= max) {
                max = tmp;
            }
        }
        return max;
    }
}

public class MaxScoreSightseeingPair {
    public static void main(String[] args) {
        Solution1014 solution1014 = new Solution1014();
        int res = solution1014.maxScoreSightseeingPair(new int[]{1, 3, 5});
        System.out.println(res);
    }
}
