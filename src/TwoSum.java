import java.util.Arrays;
import java.util.HashMap;

class Solution1 {
    int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(target - nums[i])) {
                return new int[]{hashmap.get(target - nums[i]), i};
            }
            hashmap.put(nums[i], i);

        }

    return null;
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();

        System.out.println(Arrays.toString(sol.twoSum(new int[]{3,3}, 6)));
    }
}
