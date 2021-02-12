import java.util.Arrays;

class Solution189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start += 1;
            end -= 1;
        }
    }
}

public class Rotate {
    public static void main(String[] args) {
        Solution189 solution189 = new Solution189();
        int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        solution189.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
