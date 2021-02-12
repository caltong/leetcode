import utils.Tree;
import utils.TreeNode;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0) {
            int size = queue.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode nextTreeNode = queue.poll();
                TreeNode left = nextTreeNode.left;
                TreeNode right = nextTreeNode.right;
                if (left != null) {
                    queue.add(left);
                }
                if (right != null) {
                    queue.add(right);
                }
                sum += nextTreeNode.val;
            }
            res.add(sum / size);
        }
        return res;
    }
}

public class AverageOfLevels {
    public static void main(String[] args) {
        Solution637 solution637 = new Solution637();
        Tree tree = new Tree();
        TreeNode treeNode = tree.buildTreeFromList(Arrays.asList(3, 9, 20, null, null, 15, 7));
        List<Double> res = solution637.averageOfLevels(treeNode);
        System.out.println(res);
    }
}
