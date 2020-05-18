class Solution152 {
    public int maxProduct(int[] nums) {
        int maxF = nums[0];
        int minF = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int mx = maxF;
            int mn = minF;
            maxF = Math.max(mx * nums[i], Math.max(mn * nums[i], nums[i]));
            minF = Math.min(mx * nums[i], Math.min(mn * nums[i], nums[i]));
            res = Math.max(maxF, res);
        }
        return res;
    }
}

public class MaxProduct {
    public static void main(String[] args) {
        Solution152 solution152 = new Solution152();
        int res = solution152.maxProduct(new int[]{2, 3, -2, 4});
        System.out.println(res);

    }
}
