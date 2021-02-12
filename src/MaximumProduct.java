import java.util.Arrays;

class Solution628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int res1 = nums[0] * nums[1] * nums[nums.length - 1];
        int res2 = nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1];
        return Math.max(res1, res2);
    }
}


public class MaximumProduct {
    public static void main(String[] args) {
        Solution628 solution628 = new Solution628();
        int res = solution628.maximumProduct(new int[]{1, 2, 3, 4});
        System.out.println(res);
    }
}
