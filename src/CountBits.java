import java.util.Arrays;

class Solution338 {
    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int count = Integer.bitCount(i);
            ans[i] = count;
        }
        return ans;
    }
}

public class CountBits {
    public static void main(String[] args) {
        Solution338 solution338 = new Solution338();
        int[] res = solution338.countBits(2);
        System.out.println(Arrays.toString(res));
    }
}
