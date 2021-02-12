import java.util.Arrays;

class Solution130 {
    public void solve(char[][] board) {
        int row = board.length;
        if (row == 0) {
            return;
        }
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            dfs(board, i, 0);
            dfs(board, i, col - 1);
        }
        for (int i = 1; i < col; i++) {
            dfs(board, 0, i);
            dfs(board, row - 1, i);
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(char[][] board, int row, int col) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != 'O') {
            return;
        } else {
            board[row][col] = 'A';
            dfs(board, row - 1, col);
            dfs(board, row + 1, col);
            dfs(board, row, col - 1);
            dfs(board, row, col + 1);
        }
    }
}

public class Solve {
    public static void main(String[] args) {
        Solution130 solution130 = new Solution130();
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        solution130.solve(board);
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
