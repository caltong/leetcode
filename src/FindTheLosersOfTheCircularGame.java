import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2682 {
    public int[] circularGameLosers(int n, int k) {
        boolean[] hadBall = new boolean[n];
        int i = 0;
        int count = 1;
        while (!hadBall[i % n]) {
            hadBall[i % n] = true;
            i += count * k;
            count += 1;
        }
        List<Integer> res = new ArrayList<>();
        for (int j = 0; j < hadBall.length; j++) {
            if (!hadBall[j]) {
                res.add(j);
            }
        }
        return res.stream().mapToInt(j -> j + 1).toArray();
    }
}

public class FindTheLosersOfTheCircularGame {
    public static void main(String[] args) {
        int[] res = new Solution2682().circularGameLosers(5, 2);
        System.out.println(Arrays.toString(res));

    }
}
