package binarysearch;

import utils.Tree;
import utils.TreeNode;

import java.util.Arrays;

public class Q938 {
    private int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        dfs(root, low, high);
        return sum;
    }

    private void dfs(TreeNode root, int low, int high) {
        if (root != null) {
            int val = root.val;
            if (val < low) {
                dfs(root.right, low, high);
            } else if (val <= high) {
                dfs(root.left, low, high);
                sum += val;
                dfs(root.right, low, high);
            } else {
                dfs(root.left, low, high);
            }
        }
    }

    public static void main(String[] args) {
        Q938 q938 = new Q938();
        int res = q938.rangeSumBST(Tree.buildTreeFromList(Arrays.asList(10, 5, 15, 3, 7, null, 18)), 7, 15);
        System.out.println(res);
    }
}
