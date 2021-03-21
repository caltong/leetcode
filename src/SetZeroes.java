import utils.StringToList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution73 {
    public void setZeroes(int[][] matrix) {
        List<Integer> rows = new LinkedList<>();
        List<Integer> cols = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for (Integer row : rows) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[row][i] = 0;
            }
        }
        for (Integer col : cols) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}

public class SetZeroes {
    public static void main(String[] args) {
        Solution73 solution73 = new Solution73();
        int[][] ints = StringToList.twoD("[[0,1,2,0],[3,4,5,2],[1,3,1,5]]");
        solution73.setZeroes(ints);
        for (int[] row : ints) {
            System.out.println(Arrays.toString(row));
        }
    }
}
