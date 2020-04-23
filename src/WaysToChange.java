class SolutionInterview0811 {
    public int waysToChange(int n) {
        int mod = 1000000007;
        int[] coins = new int[]{25, 10, 5, 1};
        int[] res = new int[n + 1];
        res[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i < n + 1; i++) {
                res[i] = (res[i] + res[i - coin]) % mod;
            }
        }
        return res[n];
    }
}


public class WaysToChange {
    public static void main(String[] args) {
        SolutionInterview0811 solutionInterview0811 = new SolutionInterview0811();
        int res = solutionInterview0811.waysToChange(10);
        System.out.println(res);
    }
}
