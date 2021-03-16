import java.util.Arrays;

class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[] now = new int[]{0, 0};
        res[now[0]][now[1]] = 1;
        int count = 2;
        while (count <= n * n) {
            for (int[] direction : directions) {
                while (now[0] + direction[0] < n && now[0] + direction[0] >= 0 &&
                        now[1] + direction[1] < n && now[1] + direction[1] >= 0 &&
                        res[now[0] + direction[0]][now[1] + direction[1]] == 0) {
                    now[0] += direction[0];
                    now[1] += direction[1];
                    res[now[0]][now[1]] = count;
                    count += 1;
                }
            }
        }
        return res;
    }
}


public class GenerateMatrix {
    public static void main(String[] args) {
        Solution59 solution59 = new Solution59();
        int[][] res = solution59.generateMatrix(3);
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }

    }
}
