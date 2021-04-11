package dp;

public class Q264 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        for (int i = 1; i < n; i++) {
            int num2 = dp[p2] * 2;
            int num3 = dp[p3] * 3;
            int num5 = dp[p5] * 5;
            dp[i] = Math.min(Math.min(num2, num3), num5);
            if (dp[i] == num2) {
                p2 += 1;
            }
            if (dp[i] == num3) {
                p3 += 1;
            }
            if (dp[i] == num5) {
                p5 += 1;
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        Q264 q264 = new Q264();
        int res = q264.nthUglyNumber(10);
        System.out.println(res);
    }
}
