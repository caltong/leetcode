class Solution1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        for (int i = 1; i < coordinates.length; i++) {
            coordinates[i][0] -= x0;
            coordinates[i][1] -= y0;
        }
        for (int i = 2; i < coordinates.length; i++) {
            if (coordinates[1][0] * coordinates[i][1] - coordinates[1][1] * coordinates[i][0] != 0) {
                return false;
            }
        }
        return true;
    }
}

public class CheckStraightLine {
    public static void main(String[] args) {
        Solution1232 solution1232 = new Solution1232();
        boolean res = solution1232.checkStraightLine(new int[][]{{2, 1}, {4, 2}, {6, 3}});
        System.out.println(res);
    }
}
