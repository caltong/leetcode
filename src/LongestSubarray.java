import java.util.TreeMap;

class Solution1438 {
    public int longestSubarray(int[] nums, int limit) {
        int left = 0;
        int right = 0;
        int ans = 0;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        while (right < nums.length) {
            Integer count = treeMap.getOrDefault(nums[right], 0);
            treeMap.put(nums[right], count + 1);
            while (treeMap.lastKey() - treeMap.firstKey() > limit) {
                treeMap.put(nums[left], treeMap.get(nums[left]) - 1);
                if (treeMap.get(nums[left]) == 0) {
                    treeMap.remove(nums[left]);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}

public class LongestSubarray {
    public static void main(String[] args) {
        int res = new Solution1438().longestSubarray(new int[]{8, 2, 4, 7}, 4);
        System.out.println(res);
    }
}
