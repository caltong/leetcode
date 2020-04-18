class Solution11 {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);
            if (height[left] < height[right]) {
                left += 1;
            } else {
                right -= 1;
            }
        }

        return max;
    }
}

public class MaxArea {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        int result = solution11.maxArea(new int[]{10, 14, 10, 4, 10, 2, 6, 1, 6, 12});
        System.out.println(result);
    }
}
