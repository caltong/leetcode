package mathmethod;

public class Q633 {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Q633 q633 = new Q633();
        boolean res = q633.judgeSquareSum(0);
        System.out.println(res);
    }
}
