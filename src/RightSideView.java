import utils.TreeNode;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class utils.TreeNode {
 * int val;
 * utils.TreeNode left;
 * utils.TreeNode right;
 * utils.TreeNode(int x) { val = x; }
 * }
 */
class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode subTree = queue.poll();
                assert subTree != null;
                if (subTree.left != null) {
                    queue.add(subTree.left);
                }
                if (subTree.right != null) {
                    queue.add(subTree.right);
                }
                if (i == size - 1) {
                    results.add(subTree.val);
                }
            }
        }
        return results;
    }
}

public class RightSideView {
    public static void main(String[] args) {
        Solution199 solution199 = new Solution199();
        List<Integer> result = solution199.rightSideView(null);
        System.out.println(result);
    }
}
