import java.util.ArrayList;
import java.util.List;

class Solution1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                odd.add(i);
            }
        }
        Integer[] oddList = odd.toArray(new Integer[0]);
        if (oddList.length == 0 || odd.size() < k) {
            return 0;
        }
        for (int i = 0; i < oddList.length - k + 1; i++) {
            int left;
            int right;
            if (i == 0) {
                left = oddList[i];
            } else {
                left = oddList[i] - oddList[i - 1] - 1;
            }
            if ((i + k) == odd.size()) {
                right = nums.length - oddList[i + k - 1] - 1;
            } else {
                right = oddList[i + k] - oddList[i + k - 1] - 1;
            }
            count = count + (left + 1) * (right + 1);

        }
        return count;
    }
}

public class NumberOfSubarrays {
    public static void main(String[] args) {
        Solution1248 solution1248 = new Solution1248();
        int result = solution1248.numberOfSubarrays(new int[]{2, 2, 2, 1, 2, 2, 1, 2, 2, 2}, 2);
        System.out.println(result);
    }
}
