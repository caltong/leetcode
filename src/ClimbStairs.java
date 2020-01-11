class Solution70 {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int[] tmp = {1, 2};
            for (int i = 0; i < n - 2; i++) {
                int sum = tmp[0] + tmp[1];
                tmp[0] = tmp[1];
                tmp[1] = sum;
            }
            return tmp[1];
        }
    }
}

public class ClimbStairs {
    public static void main(String[] args) {
        Solution70 sol = new Solution70();
        System.out.println(sol.climbStairs(4));
    }
}
