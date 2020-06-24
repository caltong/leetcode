import java.util.Arrays;

class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int res = 10000;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                int tmpRes = nums[i] + nums[j] + nums[k];
                if (tmpRes == target) {
                    return tmpRes;
                }
                if (Math.abs(tmpRes - target) < Math.abs(res - target)) {
                    res = tmpRes;
                }
                if (tmpRes > target) {
                    int k0 = k - 1;
                    while (j < k0 && nums[k0] == nums[k]) {
                        k0 = k0 - 1;
                    }
                    k = k0;
                } else {
                    int j0 = j + 1;
                    while (j0 < k && nums[j0] == nums[j]) {
                        j0 = j0 + 1;
                    }
                    j = j0;
                }
            }
        }
        return res;
    }
}

public class ThreeSumClosest {
    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        int res = solution16.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        System.out.println(res);
    }
}
