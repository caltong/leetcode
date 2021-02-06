class Solution1423 {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int max = 0;
        int tail = cardPoints.length - 1;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        max = sum;
        for (int i = 0; i < k; i++) {
            sum = sum - cardPoints[k - 1 - i] + cardPoints[tail - i];
            max = Math.max(sum, max);
        }
        return max;
    }
}

public class MaxScore {
    public static void main(String[] args) {
        Solution1423 solution1423 = new Solution1423();
        int res = solution1423.maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3);
        System.out.println(res);
    }
}
