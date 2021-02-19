class Solution1004 {
    public int longestOnes(int[] A, int K) {
        int count0 = 0;
        int max = 0;
        int start = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                count0++;
            }
            while (count0 > K) {
                if (A[start] == 0) {
                    count0--;
                }
                start++;
            }
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}

public class LongestOnes {
    public static void main(String[] args) {
        Solution1004 solution1004 = new Solution1004();
        int res = solution1004.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2);
        System.out.println(res);
    }
}
