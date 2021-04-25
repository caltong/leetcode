package tree;

import utils.Tree;
import utils.TreeNode;

import java.util.Arrays;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class Q897 {
    TreeNode ans;
    TreeNode ansRoot;

    public TreeNode increasingBST(TreeNode root) {
        ans = new TreeNode();
        ansRoot = ans;
        dfs(root);
        return ansRoot.right;
    }

    private void dfs(TreeNode root) {
        if (root != null) {
            dfs(root.left);
            ans.right = new TreeNode(root.val);
            ans = ans.right;
            dfs(root.right);
        }
    }

    public static void main(String[] args) {
        Q897 q897 = new Q897();
        TreeNode res = q897.increasingBST(Tree.buildTreeFromList(Arrays.asList(5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9)));
        System.out.println(res);
    }
}
