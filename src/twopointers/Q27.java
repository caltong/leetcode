package twopointers;

public class Q27 {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left += 1;
            }
            right += 1;
        }
        return left;
    }

    public static void main(String[] args) {
        Q27 q27 = new Q27();
        int res = q27.removeElement(new int[]{3, 2, 2, 3}, 3);
        System.out.println(res);
    }
}
