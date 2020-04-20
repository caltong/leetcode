class Solution200 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int nums = 0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    nums += 1;
                    dfs(grid, new int[]{i, j});
                }
            }
        }
        return nums;
    }

    private void dfs(char[][] grid, int[] current) {
        int row = grid.length;
        int col = grid[0].length;
        if (current[0] < 0 || current[1] < 0 || current[0] >= row || current[1] >= col || grid[current[0]][current[1]] == '0') {
            return;
        }
        grid[current[0]][current[1]] = '0';
        dfs(grid, new int[]{current[0] - 1, current[1]});
        dfs(grid, new int[]{current[0] + 1, current[1]});
        dfs(grid, new int[]{current[0], current[1] - 1});
        dfs(grid, new int[]{current[0], current[1] + 1});
    }


}

public class NumIslands {
    public static void main(String[] args) {
        Solution200 solution200 = new Solution200();
        int result = solution200.numIslands(new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}});
        System.out.println(result);
    }
}
