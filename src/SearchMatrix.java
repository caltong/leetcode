import utils.StringToList;

import java.util.Arrays;

class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int up = 0;
        int down = m - 1;
        int middle = (up + down) / 2;
        while (up <= down) {
            middle = (up + down) / 2;
            if (target < matrix[middle][0]) {
                down = middle - 1;
            } else if (target > matrix[middle][0]) {
                up = middle + 1;
            } else {
                return true;
            }
        }
        if (middle > 0 && target < matrix[middle][0]) {
            middle -= 1;
        }
        int i = Arrays.binarySearch(matrix[middle], target);
        return i >= 0;
    }
}

public class SearchMatrix {
    public static void main(String[] args) {
        Solution74 solution74 = new Solution74();
        boolean res = solution74.searchMatrix(StringToList.twoD("[[1,3,5,7],[10,11,16,20],[23,30,34,60]]"), 12);
        System.out.println(res);
    }
}
