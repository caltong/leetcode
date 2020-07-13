import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                intersection[index] = num;
                index++;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }
}

public class Intersect {
    public static void main(String[] args) {
        Solution350 solution350 = new Solution350();
        int[] res = solution350.intersect(new int[]{1, 2, 2, 1, 1}, new int[]{2, 2});
        System.out.println(Arrays.toString(res));
    }
}
