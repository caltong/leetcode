package math;

public class Q7 {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x = x / 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }

    public static void main(String[] args) {
        Q7 q7 = new Q7();
        int res = q7.reverse(12345);
        System.out.println(res);
    }
}
