class SolutionInterview1721 {
    public int trap(int[] height) {
        int len = height.length;
        if (len == 0) {
            return 0;
        }
        int[] left = new int[len];
        left[0] = height[0];
        for (int i = 1; i < len; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        int[] right = new int[len];
        right[len - 1] = height[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
        int res = 0;
        for (int i = 0; i < len; i++) {
            res += Math.min(left[i], right[i]) - height[i];
        }
        return res;
    }
}

public class Trap {
    public static void main(String[] args) {
        SolutionInterview1721 solutionInterview1721 = new SolutionInterview1721();
        int res = solutionInterview1721.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        System.out.println(res);
    }
}
