class Solution69 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        double C = x;
        double x0 = x;
        while (true) {
            double xi = 0.5 * (x0 + C / x0);
            if (Math.abs(x0 - xi) < 1e-7) {
                break;
            }
            x0 = xi;
        }
        return (int) x0;
    }
}

public class MySqrt {
    public static void main(String[] args) {
        Solution69 sol = new Solution69();
        System.out.println(sol.mySqrt(2147395599));
    }
}
