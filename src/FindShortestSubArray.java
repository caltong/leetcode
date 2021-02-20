import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution697 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer value = map.getOrDefault(num, 0);
            map.put(num, value + 1);
        }
        int maxCount = 0;
        for (int key : map.keySet()) {
            maxCount = Math.max(maxCount, map.get(key));
        }
        List<Integer> list = new LinkedList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == maxCount) {
                list.add(key);
            }
        }
        int ans = nums.length;
        for (int num : list) {
            int left = 0;
            int right = nums.length - 1;
            while (nums[left] != num) {
                left++;
            }
            while (nums[right] != num) {
                right--;
            }
            ans = Math.min(ans, right - left + 1);
        }
        return ans;
    }
}

public class FindShortestSubArray {
    public static void main(String[] args) {
        Solution697 solution697 = new Solution697();
        int res = solution697.findShortestSubArray(new int[]{1, 2, 2, 3, 1});
        System.out.println(res);
    }
}
