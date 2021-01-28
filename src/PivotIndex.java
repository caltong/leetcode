import java.util.Arrays;

class Solution724 {
    public int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2 * leftSum + nums[i] == sum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}

public class PivotIndex {
    public static void main(String[] args) {
        Solution724 solution724 = new Solution724();
        int res = solution724.pivotIndex(new int[]{-1, -1, -1, -1, -1, 0});
        System.out.println(res);
    }
}
