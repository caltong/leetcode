import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int len = nums.length;
        int mid = len / 2;
        int midVal = nums[mid];
        TreeNode root = new TreeNode(midVal);
        if (mid > 0) {
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        }
        if (mid < len - 1) {
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, len));
        }
        return root;
    }
}

public class SortedArrayToBST {
}
