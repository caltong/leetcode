class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];
        if (obstacleGrid[0][0] == 0) {
            dp[0][0] = 1;
        } else {
            dp[0][0] = 0;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                int up = 0;
                int left = 0;
                if (obstacleGrid[i][j] == 0) {
                    if (i != 0) {
                        up = dp[i - 1][j];
                    }
                    if (j != 0) {
                        left = dp[i][j - 1];
                    }
                }
                dp[i][j] = up + left;
            }
        }
        return dp[row - 1][col - 1];
    }
}

public class UniquePathsWithObstacles {
    public static void main(String[] args) {
        Solution63 solution63 = new Solution63();
        int res = solution63.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}});
        System.out.println(res);
    }
}
