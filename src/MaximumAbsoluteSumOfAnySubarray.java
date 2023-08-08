class Solution1749 {
    public int maxAbsoluteSum(int[] nums) {
        int positiveSum = 0;
        int positiveMax = 0;
        int negativeSum = 0;
        int negativeMin = 0;

        for (int num : nums) {
            positiveSum += num;
            positiveMax = Math.max(positiveMax, positiveSum);
            positiveSum = Math.max(0, positiveSum);

            negativeSum += num;
            negativeMin = Math.min(negativeMin, negativeSum);
            negativeSum = Math.min(0, negativeSum);
        }

        return Math.max(positiveMax, -negativeMin);
    }
}

public class MaximumAbsoluteSumOfAnySubarray {
    public static void main(String[] args) {
        int res = new Solution1749().maxAbsoluteSum(new int[]{2, -5, 1, -4, 3, -2});
        System.out.println(res);
    }
}
