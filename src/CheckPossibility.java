class Solution665 {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        int maxIndex = 0;
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[maxIndex] <= nums[i]) {
                maxIndex = i;
            } else {
                count++;
            }
            i++;
        }
        int minIndex = n - 1;
        i = n - 1;
        int countBack = 0;
        while (i >= 0) {
            if (nums[i] <= nums[minIndex]) {
                minIndex = i;
            } else {
                countBack++;
            }
            i--;
        }
        return count <= 1 || countBack <= 1;
    }
}

public class CheckPossibility {
    public static void main(String[] args) {
        Solution665 solution665 = new Solution665();
        boolean res = solution665.checkPossibility(new int[]{4, 2, 3});
        System.out.println(res);
    }
}
