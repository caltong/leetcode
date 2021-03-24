class Solution456 {
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = len - 1; j > i + 1; j--) {
                int left = nums[i];
                int middle = nums[j - 1];
                int right = nums[j];
                if (right > left) {
                    min = Math.min(min, right);
                }
                if (middle > min) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class Find132pattern {
    public static void main(String[] args) {
        Solution456 solution456 = new Solution456();
        boolean res = solution456.find132pattern(new int[]{1, 2, 3, 4});
        System.out.println(res);
    }
}
