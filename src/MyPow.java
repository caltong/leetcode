class Solution50 {
    public double myPow(double x, int n) {
        long N = n;
        return n >= 0 ? quickMul(x, N) : 1 / quickMul(x, -N);
    }

    private double quickMul(double x, long N) {
        if (N == 0) {
            return 1;
        } else {
            double y = quickMul(x, N / 2);
            return N % 2 == 0 ? y * y : y * y * x;
        }
    }
}

public class MyPow {
    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
        double res = solution50.myPow(2, -5);
        System.out.println(res);
    }
}
