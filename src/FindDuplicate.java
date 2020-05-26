/*
说明：

1. 不能更改原数组（假设数组是只读的）。
2. 只能使用额外的 O(1) 的空间。
3. 时间复杂度小于 O(n2) 。
4. 数组中只有一个重复的数字，但它可能不止重复出现一次。
 */

class Solution287 {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int left = 1;
        int right = n - 1;
        int res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cnt = 0;
            for (int num : nums) {
                if (num <= mid) {
                    cnt++;
                }
            }
            if (cnt <= mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
                res = mid;
            }
        }
        return res;
    }
}


public class FindDuplicate {
    public static void main(String[] args) {
        Solution287 solution287 = new Solution287();
        int res = solution287.findDuplicate(new int[]{1, 3, 4, 2, 2});
        System.out.println(res);
    }
}
