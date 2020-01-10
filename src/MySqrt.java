class Solution69 {
    public int mySqrt(int x) {
        long left = 0;
        long right = x;
        while (left < right) {
            long mid = (right + left + 1) / 2;
            if (mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int) left;
    }
}

public class MySqrt {
    public static void main(String[] args) {
        Solution69 sol = new Solution69();
        System.out.println(sol.mySqrt(2147395599));
    }
}
