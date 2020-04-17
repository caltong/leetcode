class Solution55 {
    public boolean canJump(int[] nums) {
        //倒序遍历
        int target = nums.length - 1;
        int source = nums.length - 2;
        boolean result = true;
        while (target >= 1 && source >= 0) {
            if (nums[source] >= target - source) {
                target = source;
                source = target - 1;
                result = true;
            } else {
                source -= 1;
                result = false;
            }
        }
        return result;

        //贪心
//        int max = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            if (i <= max) {
//                max = Math.max(nums[i] + i, max);
//                if (max >= nums.length - 1) {
//                    return true;
//                }
//            }
//        }
//        return false;
    }
}

public class CanJump {
    public static void main(String[] args) {
        Solution55 solution55 = new Solution55();
        boolean result = solution55.canJump(new int[]{0});
        System.out.println(result);
    }
}
