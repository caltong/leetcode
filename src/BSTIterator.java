import utils.TreeNode;

import java.util.Iterator;
import java.util.LinkedList;
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
class BSTIterator {
    List<Integer> list = new LinkedList<>();
    Iterator<Integer> iterator;

    public BSTIterator(TreeNode root) {
        recursion(root);
        iterator = list.iterator();
    }

    private void recursion(TreeNode root) {
        if (root != null) {
            recursion(root.left);
            list.add(root.val);
            recursion(root.right);
        }
    }

    public int next() {
        return iterator.next();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */