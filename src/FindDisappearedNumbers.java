import java.util.LinkedList;
import java.util.List;

class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 1) {
                int index = i;
                int value = nums[index];
                while (nums[value - 1] >= 0) {
                    index = value - 1;
                    value = nums[index];
                    nums[index] = -1;
                }
            }
        }
        List<Integer> ans = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        Solution448 solution448 = new Solution448();
        List<Integer> res = solution448.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(res);
    }
}
