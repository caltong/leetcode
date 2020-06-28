class Solution209 {
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int sum = 0;
        while (end < len) {
            sum += nums[end];
            while (sum >= s) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start += 1;
            }
            end += 1;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}

public class MinSubArrayLen {
    public static void main(String[] args) {
        Solution209 solution209 = new Solution209();
        int res = solution209.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        System.out.println(res);
    }
}
