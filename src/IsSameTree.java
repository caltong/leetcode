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
class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }
}

public class IsSameTree {
    public static void main(String[] args) {

    }
}
