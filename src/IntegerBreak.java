class Solution343 {
    public int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        } else {
            int quotient = n / 3;
            int remainder = n % 3;
            if (remainder == 0) {
                return (int) (Math.pow(3, quotient));
            } else if (remainder == 1) {
                return (int) (Math.pow(3, quotient - 1) * 4);
            } else {
                return (int) (Math.pow(3, quotient) * 2);
            }
        }
    }
}

public class IntegerBreak {
    public static void main(String[] args) {
        Solution343 solution343 = new Solution343();
        int res = solution343.integerBreak(20);
        System.out.println(res);
    }
}
