class Solution136 {
    public int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[0] = nums[0] ^ nums[i];
        }
        return nums[0];
    }
}

public class SingleNumber {
    public static void main(String[] args) {
        Solution136 solution136 = new Solution136();
        int res = solution136.singleNumber(new int[]{2, 2, 3, 5, 5});
        System.out.println(res);
    }
}
