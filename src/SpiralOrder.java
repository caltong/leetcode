import java.util.LinkedList;
import java.util.List;

class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] visited = new int[row][col];
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int count = 0;
        List<Integer> res = new LinkedList<>();
        int[] now = new int[]{0, 0};
        count += 1;
        res.add(matrix[now[0]][now[1]]);
        visited[now[0]][now[1]] = 1;
        while (count < row * col) {
            for (int[] direction : directions) {
                while (now[0] + direction[0] < row && now[0] + direction[0] >= 0 &&
                        now[1] + direction[1] < col && now[1] + direction[1] >= 0 &&
                        visited[now[0] + direction[0]][now[1] + direction[1]] == 0) {
                    now[0] += direction[0];
                    now[1] += direction[1];
                    res.add(matrix[now[0]][now[1]]);
                    visited[now[0]][now[1]] = 1;
                    count += 1;
                }
            }
        }
        return res;
    }
}

public class SpiralOrder {
    public static void main(String[] args) {
        Solution54 solution54 = new Solution54();
        List<Integer> res = solution54.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(res);
    }
}
