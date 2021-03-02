class NumMatrix304 {
    private int[][] preSum;

    public NumMatrix304(int[][] matrix) {
        int row = matrix.length;
        if (row > 0) {
            int col = matrix[0].length;
            preSum = new int[row][col + 1];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    preSum[i][j + 1] = preSum[i][j] + matrix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            sum += (preSum[i][col2 + 1] - preSum[i][col1]);
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */

public class SumRegion {
    public static void main(String[] args) {
        NumMatrix304 numMatrix304 = new NumMatrix304(new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}});
        int res = numMatrix304.sumRegion(1, 2, 2, 4);
        System.out.println(res);
    }
}