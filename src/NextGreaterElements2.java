import java.util.Arrays;
import java.util.Stack;

class Solution503 {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 2 * len; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % len]) {
                res[stack.pop()] = nums[i % len];
            }
            stack.push(i % len);
        }
        return res;
    }
}

public class NextGreaterElements2 {
    public static void main(String[] args) {
        Solution503 solution503 = new Solution503();
        int[] res = solution503.nextGreaterElements(new int[]{1, 2, 1});
        System.out.println(Arrays.toString(res));
    }
}
