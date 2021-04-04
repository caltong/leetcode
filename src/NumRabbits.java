import java.util.HashMap;
import java.util.Map;

class Solution781 {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int answer : answers) {
            Integer count = map.getOrDefault(answer, 0);
            map.put(answer, count + 1);
        }
        int res = 0;
        for (int key : map.keySet()) {
            res += Math.ceil(1.0 * map.get(key) / (key + 1)) * (key + 1);
        }
        return res;
    }
}

public class NumRabbits {
    public static void main(String[] args) {
        Solution781 solution781 = new Solution781();
        int res = solution781.numRabbits(new int[]{1, 1, 2});
        System.out.println(res);
    }
}
