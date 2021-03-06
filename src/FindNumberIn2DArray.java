class SolutionOffer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row = matrix.length;
        if (row == 0) {
            return false;
        }
        int col = matrix[0].length;
        int targetRow = 0;
        int targetCol = col - 1;
        while (targetRow < row && targetCol >= 0) {
            if (matrix[targetRow][targetCol] > target) {
                targetCol -= 1;
            } else if (matrix[targetRow][targetCol] < target) {
                targetRow += 1;
            } else {
                return true;
            }
        }
        return false;
    }
}

public class FindNumberIn2DArray {

}
