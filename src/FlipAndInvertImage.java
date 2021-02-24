import java.util.Arrays;

class Solution832 {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A[0].length - j - 1] ^ 1;
                A[i][A[0].length - j - 1] = temp ^ 1;
            }
            if (A[i].length % 2 == 1) {
                A[i][A[i].length / 2] ^= 1;
            }
        }
        return A;
    }
}

public class FlipAndInvertImage {
    public static void main(String[] args) {
        Solution832 solution832 = new Solution832();
        int[][] res = solution832.flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
        for (int[] re : res) {
            System.out.println(Arrays.toString(re));
        }
    }
}
