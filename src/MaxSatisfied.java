class Solution1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int[] valid = new int[customers.length];
        int notAngry = 0;
        for (int i = 0; i < customers.length; i++) {
            valid[i] = customers[i] * grumpy[i];
            if (grumpy[i] == 0) {
                notAngry += customers[i];
            }
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < customers.length; i++) {
            if (i < X) {
                sum += valid[i];
            } else {
                sum = sum + valid[i] - valid[i - X];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return notAngry + max;
    }
}

public class MaxSatisfied {
    public static void main(String[] args) {
        Solution1052 solution1052 = new Solution1052();
        int res = solution1052.maxSatisfied(new int[]{3}, new int[]{1}, 1);
        System.out.println(res);
    }
}
