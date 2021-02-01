import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int diff = sumA - sumB;
        Set<Integer> set = new HashSet<>();
        for (int b : B) {
            set.add(b);
        }
        int[] ans = new int[2];
        for (int a : A) {
            int b = a - diff / 2;
            if (set.contains(b)) {
                ans[0] = a;
                ans[1] = b;
            }
        }
        return ans;
    }
}

public class FairCandySwap {
    public static void main(String[] args) {
        Solution888 solution888 = new Solution888();
        int[] res = solution888.fairCandySwap(new int[]{1, 1}, new int[]{2, 2});
        System.out.println(Arrays.toString(res));
    }
}
