class Solution509 {
    public int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

public class Fib {
    public static void main(String[] args) {
        Solution509 solution509 = new Solution509();
        int fib = solution509.fib(10);
        System.out.println(fib);
    }
}
