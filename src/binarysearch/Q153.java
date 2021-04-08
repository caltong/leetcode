package binarysearch;

public class Q153 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        Q153 q153 = new Q153();
        int min = q153.findMin(new int[]{3, 4, 5, 1, 2});
        System.out.println(min);
    }
}
