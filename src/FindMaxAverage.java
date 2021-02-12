class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        double preSum = 0;
        for (int i = 0; i < k; i++) {
            preSum += nums[i];
        }
        double max = preSum;
        for (int i = k; i < nums.length; i++) {
            preSum = preSum - nums[i - k] + nums[i];
            max = Math.max(preSum, max);
        }
        return max / k;
    }
}

public class FindMaxAverage {
    public static void main(String[] args) {
        Solution643 solution643 = new Solution643();
        double res = solution643.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        System.out.println(res);
    }
}
