class Solution96 {
    public int numTrees(int n) {
        // 提示：我们在这里需要用 long 类型防止计算过程中的溢出
        long C = 1;
        for (int i = 0; i < n; ++i) {
            C = C * 2 * (2 * i + 1) / (i + 2);
        }
        return (int) C;
    }
}

public class NumTrees {
    public static void main(String[] args) {
        Solution96 solution96 = new Solution96();
        int res = solution96.numTrees(7);
        System.out.println(res);
    }
}
