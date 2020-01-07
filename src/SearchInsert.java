class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;

        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        if (nums[left] == target) {
            return left;
        } else if (nums[left] < target) {
            return left + 1;
        } else return 0;
    }
}


public class SearchInsert {
    public static void main(String[] args) {
        Solution35 sol = new Solution35();
        System.out.println(sol.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}
