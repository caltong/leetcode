package twopointers;

import java.util.Arrays;

public class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] <= nums2[p2]) {
                nums1[p3] = nums2[p2];
                p2 -= 1;
                p3 -= 1;
            } else {
                nums1[p3] = nums1[p1];
                p1 -= 1;
                p3 -= 1;
            }
        }
        while (p2 >= 0) {
            nums1[p2] = nums2[p2];
            p2 -= 1;
        }
    }

    public static void main(String[] args) {
        Q88 q88 = new Q88();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        q88.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
