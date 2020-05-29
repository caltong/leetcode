class Solution198 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
}

public class Rob {
    public static void main(String[] args) {
        Solution198 solution198 = new Solution198();
        int res = solution198.rob(new int[]{2, 7, 9, 3, 1});
        System.out.println(res);
    }
}
