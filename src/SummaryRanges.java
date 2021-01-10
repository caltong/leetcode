import java.util.LinkedList;
import java.util.List;

class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new LinkedList<>();
        if (nums.length == 0) {
            return res;
        }
        int start = nums[0];
        int end = nums[0];
        int before = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if ((long) nums[i] - (long) before <= 1) {
                end += 1;
            } else {
                if (start != end) {
                    res.add(start + "->" + end);
                } else {
                    res.add("" + start);
                }
                start = nums[i];
                end = nums[i];
            }
            before = nums[i];
        }
        if (start != end) {
            res.add(start + "->" + end);
        } else {
            res.add("" + start);
        }
        return res;
    }
}

public class SummaryRanges {
    public static void main(String[] args) {
        Solution228 solution228 = new Solution228();
        List<String> res = solution228.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        System.out.println(res);
    }
}
