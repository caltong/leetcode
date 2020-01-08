class Solution53 {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int totalSum = currentSum;
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            totalSum = Math.max(currentSum, totalSum);
        }
        return totalSum;
    }
}

public class MaxSubArray {
    public static void main(String[] args) {
        Solution53 sol = new Solution53();
        System.out.println(sol.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
