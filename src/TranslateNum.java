class SolutionInterview46 {
    public int translateNum(int num) {
        String stringNum = String.valueOf(num);
        if (stringNum.length() == 1) {
            return 1;
        }
        int[] dp = new int[stringNum.length()];
        dp[0] = 1;
        int current = stringNum.charAt(1) - '0';
        int pre = stringNum.charAt(0) - '0';
        if (pre * 10 + current > 25) {
            dp[1] = 1;
        } else {
            dp[1] = 2;
        }
        for (int i = 2; i < stringNum.length(); i++) {
            current = stringNum.charAt(i) - '0';
            pre = stringNum.charAt(i - 1) - '0';
            if ((pre * 10 + current) > 25 || (pre * 10 + current) < 10) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 2] + dp[i - 1];
            }
        }
        return dp[stringNum.length() - 1];
    }
}

public class TranslateNum {
    public static void main(String[] args) {
        SolutionInterview46 solutionInterview46 = new SolutionInterview46();
        int res = solutionInterview46.translateNum(11258);
        System.out.println(res);
    }
}
