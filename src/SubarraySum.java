import java.util.HashMap;

class Solution560 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int pre = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int num : nums) {
            pre += num;
            if (mp.containsKey(pre - k)) {
                count += mp.get(pre - k);
            }
            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}

public class SubarraySum {
    public static void main(String[] args) {
        Solution560 solution560 = new Solution560();
        int res = solution560.subarraySum(new int[]{1, 1, 1}, 2);
        System.out.println(res);
    }
}
