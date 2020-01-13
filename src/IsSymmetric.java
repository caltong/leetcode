/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == root.right) {
            return isSymmetric(root.left) && isSymmetric(root.right);
        } else {
            return false;
        }
    }
}

public class IsSymmetric {
}
