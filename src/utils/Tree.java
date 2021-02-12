package utils;

import java.util.List;

public class Tree {
    private TreeNode root;
    private List<Integer> treeList;

    public TreeNode buildTreeFromList(List<Integer> treeList) {
        this.treeList = treeList;
        root = new TreeNode(treeList.get(0));
        subTreeNode(root, 0);
        return root;
    }

    private void subTreeNode(TreeNode node, Integer index) {
        int maxIndex = treeList.size() - 1;
        int leftIndex = index * 2 + 1;
        int rightIndex = index * 2 + 2;
        if (leftIndex > maxIndex || treeList.get(leftIndex) == null) {
            node.left = null;
        } else {
            node.left = new TreeNode(treeList.get(leftIndex));
            subTreeNode(node.left, leftIndex);
        }
        if (rightIndex > maxIndex || treeList.get(rightIndex) == null) {
            node.right = null;
        } else {
            node.right = new TreeNode(treeList.get(rightIndex));
            subTreeNode(node.right, rightIndex);
        }
    }
}
