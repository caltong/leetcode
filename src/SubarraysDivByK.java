import java.util.HashMap;
import java.util.Map;

class Solution974 {
    public int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> record = new HashMap<>();
        record.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int value : A) {
            sum += value;
            int mod = (sum % K + K) % K;
            int same = record.getOrDefault(mod, 0);
            ans += same;
            record.put(mod, same + 1);
        }
        return ans;
    }
}

public class SubarraysDivByK {
    public static void main(String[] args) {
        Solution974 solution974 = new Solution974();
        int res = solution974.subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5);
        System.out.println(res);
    }
}
