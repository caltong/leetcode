package tree;

import utils.Tree;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
public class Q783 {
    List<Integer> list;

    public int minDiffInBST(TreeNode root) {
        list = new ArrayList<>();
        dfs(root);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }
        return min;
    }

    private void dfs(TreeNode root) {
        if (root != null) {
            dfs(root.left);
            list.add(root.val);
            dfs(root.right);
        }
    }

    public static void main(String[] args) {
        Q783 q783 = new Q783();
        TreeNode treeNode = Tree.buildTreeFromList(Arrays.asList(1, 0, 48, null, null, 12, 49));
        int res = q783.minDiffInBST(treeNode);
        System.out.println(res);
    }
}
