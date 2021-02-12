class Solution1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        int[] cp = new int[100];
        for (int i = 0; i < dominoes.length; i++) {
            int a = dominoes[i][0];
            int b = dominoes[i][1];
            int index = a < b ? a * 10 + b : b * 10 + a;
            cp[index]++;
        }
        for (int i = 0; i < cp.length; i++) {
            count += cp[i] * (cp[i] - 1) / 2;
        }
        return count;
    }
}

public class NumEquivDominoPairs {
    public static void main(String[] args) {
        Solution1128 solution1128 = new Solution1128();
        int res = solution1128.numEquivDominoPairs(new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}});
        System.out.println(res);
    }
}
