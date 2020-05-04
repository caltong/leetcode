class Solution45 {
    public int jump(int[] nums) {
        int max = 0;
        int end = 0;
        int step = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i == end) {
                end = max;
                step += 1;
            }
        }
        return step;
    }
}

public class Jump {
    public static void main(String[] args) {
        Solution45 solution45 = new Solution45();
        int res = solution45.jump(new int[]{2, 3, 1, 1, 4});
        System.out.println(res);
    }
}
