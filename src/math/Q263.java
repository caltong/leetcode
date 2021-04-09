package math;

public class Q263 {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] factors = new int[]{2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Q263 q263 = new Q263();
        boolean res = q263.isUgly(Integer.MAX_VALUE);
        System.out.println(res);
    }
}
