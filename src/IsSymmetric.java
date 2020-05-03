import utils.TreeNode;

/**
 * Definition for a binary tree node.
 * public class utils.TreeNode {
 * int val;
 * utils.TreeNode left;
 * utils.TreeNode right;
 * utils.TreeNode(int x) { val = x; }
 * }
 */
class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return isSymmetricSame(root.left, root.right);
        }
    }

    boolean isSymmetricSame(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        } else if (t1 == null || t2 == null) {
            return false;
        } else if (t1.val != t2.val) {
            return false;
        } else {
            return isSymmetricSame(t1.left, t2.right) && isSymmetricSame(t1.right, t2.left);
        }
    }
}

public class IsSymmetric {
}
