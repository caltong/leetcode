import java.util.LinkedList;
import java.util.Queue;

class Solution542 {
    public int[][] updateMatrix(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        int[][] vector = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<int[]> queue = new LinkedList<int[]>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] != 0) {
                    matrix[i][j] = row + col;
                } else if (matrix[i][j] == 0) {
                    // 将所有0元素作为BFS的第一层
                    queue.add(new int[]{i, j});
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            //搜索上下左右四个方向
            for (int[] v : vector) {
                int nextRow = current[0] + v[0];
                int nextCol = current[1] + v[1];
                if (nextRow >= 0 && nextRow < row && nextCol >= 0 && nextCol < col && matrix[nextRow][nextCol] > matrix[current[0]][
                        current[1]] + 1) {
                    matrix[nextRow][nextCol] = matrix[current[0]][current[1]] + 1;
                    queue.add(new int[]{nextRow, nextCol});
                }
            }
        }

        return matrix;
    }
}

public class UpdateMatrix {
    public static void main(String[] args) {
        Solution542 solution542 = new Solution542();
        int[][] result = solution542.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}});
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
