import java.util.Arrays;

class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int beforeRow = nums.length;
        int beforeCol = nums[0].length;
        if (beforeRow * beforeCol != r * c) {
            return nums;
        }
        int index = 0;
        int[][] ans = new int[r][c];
        for (int i = 0; i < beforeRow; i++) {
            for (int j = 0; j < beforeCol; j++) {
                ans[index / c][index % c] = nums[i][j];
                index++;
            }
        }
        return ans;
    }
}

public class MatrixReshape {
    public static void main(String[] args) {
        Solution566 solution566 = new Solution566();
        int[][] res = solution566.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }
}
