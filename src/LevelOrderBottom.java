import utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class utils.TreeNode {
 * int val;
 * utils.TreeNode left;
 * utils.TreeNode right;
 * utils.TreeNode(int x) { val = x; }
 * }
 */
class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> oneLevel = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode oneNode = queue.poll();
                assert oneNode != null;
                oneLevel.add(oneNode.val);
                if (oneNode.left != null) {
                    queue.add(oneNode.left);
                }
                if (oneNode.right != null) {
                    queue.add(oneNode.right);
                }
            }
            result.add(0, oneLevel);
        }
        return result;
    }
}

public class LevelOrderBottom {
}
