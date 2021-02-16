import java.util.Arrays;

class Solution561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }
        return sum;
    }
}

public class ArrayPairSum {
    public static void main(String[] args) {
        Solution561 solution561 = new Solution561();
        int res = solution561.arrayPairSum(new int[]{1, 4, 3, 2});
        System.out.println(res);
    }
}
