import java.util.Arrays;

class Solution867 {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}

public class Transpose {
    public static void main(String[] args) {
        Solution867 solution867 = new Solution867();
        int[][] res = solution867.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }
}
