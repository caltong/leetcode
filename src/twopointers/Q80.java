package twopointers;

import java.util.Arrays;

public class Q80 {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 2) {
            return len;
        }
        int p1 = 0;
        int p2 = 2;
        while (p2 < len) {
            if (nums[p1] == nums[p1 + 1] && nums[p1] == nums[p2]) {
                p2 += 1;
            } else {
                nums[p1 + 2] = nums[p2];
                p1 += 1;
                p2 += 1;
            }
        }
        return p1 + 2;
    }

    public static void main(String[] args) {
        Q80 q80 = new Q80();
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int res = q80.removeDuplicates(nums);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
    }
}
