class Solution674 {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] <= nums[i - 1]) {
                start = i;
            }
            ans = Math.max(ans, i - start + 1);
        }
        return ans;
    }
}

public class FindLengthOfLCIS {
    public static void main(String[] args) {
        Solution674 solution674 = new Solution674();
        int res = solution674.findLengthOfLCIS(new int[]{2, 2, 2, 2, 2});
        System.out.println(res);
    }
}
