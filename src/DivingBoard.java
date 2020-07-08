import java.util.Arrays;

class SolutionInterview1611 {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] ans = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            ans[i] = shorter * (k - i) + longer * (i);
        }
        return ans;
    }
}

public class DivingBoard {
    public static void main(String[] args) {
        SolutionInterview1611 solutionInterview1611 = new SolutionInterview1611();
        int[] res = solutionInterview1611.divingBoard(1, 2, 3);
        System.out.println(Arrays.toString(res));
    }
}
