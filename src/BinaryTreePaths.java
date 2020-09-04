import utils.TreeNode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution257 {
    private List<String> res;
    private List<Integer> path;

    public List<String> binaryTreePaths(TreeNode root) {
        res = new ArrayList<>();
        path = new ArrayList<>();
        if (root == null) {
            return res;
        }
        dfs(root);
        return res;
    }

    private void dfs(TreeNode node) {
        if (node.left != null) {
            path.add(node.val);
            dfs(node.left);
            path.remove(path.size() - 1);
        }
        if (node.right != null) {
            path.add(node.val);
            dfs(node.right);
            path.remove(path.size() - 1);
        }
        if (node.left == null && node.right == null) {
            path.add(node.val);
            StringBuilder stringBuilder = new StringBuilder();
            for (Integer oneNode :
                    path) {
                stringBuilder.append(oneNode);
                stringBuilder.append("->");
            }
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
            res.add(stringBuilder.toString());
            path.remove(path.size() - 1);
        }
    }
}

public class BinaryTreePaths {
}
