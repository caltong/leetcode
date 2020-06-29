import java.util.Arrays;

class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

public class FindKthLargest {
    public static void main(String[] args) {
        Solution215 solution215 = new Solution215();
        int res = solution215.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);
        System.out.println(res);
    }
}
