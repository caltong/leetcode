class NumArray303 {
    private final int[] forward;

    public NumArray303(int[] nums) {
        int len = nums.length;
        forward = new int[len + 1];
        for (int i = 0; i < len; i++) {
            forward[i + 1] = forward[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return forward[j + 1] - forward[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */


public class SumRange {
    public static void main(String[] args) {
        NumArray303 numArray303 = new NumArray303(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray303.sumRange(0, 2));
        System.out.println(numArray303.sumRange(2, 5));
        System.out.println(numArray303.sumRange(0, 5));
    }
}
