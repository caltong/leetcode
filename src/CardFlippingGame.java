import java.util.HashSet;
import java.util.Set;

class Solution822 {
    public int flipgame(int[] fronts, int[] backs) {
        Set<Integer> sameFrontAndBackSet = new HashSet<>();
        for (int i = 0; i < fronts.length; i++) {
            if (fronts[i] == backs[i]) {
                sameFrontAndBackSet.add(fronts[i]);
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < fronts.length; i++) {
            if (!sameFrontAndBackSet.contains(fronts[i])) {
                res = Math.min(res, fronts[i]);
            }
            if (!sameFrontAndBackSet.contains(backs[i])) {
                res = Math.min(res, backs[i]);
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}

public class CardFlippingGame {
    public static void main(String[] args) {
        int res = new Solution822().flipgame(new int[]{1, 2, 4, 4, 7}, new int[]{1, 3, 4, 1, 3});
        System.out.println(res);
    }
}
