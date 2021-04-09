package binarysearch;

public class Q154 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right -= 1;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        Q154 q154 = new Q154();
        int min = q154.findMin(new int[]{2, 2, 2, 0, 1});
        System.out.println(min);
    }
}
