package easy.MaximumDepthOfBinaryTree;

import common.datastruct.TreeNode;

public class Solution {

	/**
	 * Given a binary tree, find the maximum depth.
	 * The maximum depth is the number of nodes along the longest path
	 * from the root node down to the farthest leaf node
	 * @param root
	 * @return maximum depth
	 */
	public int maxDepth(TreeNode root) {
		int result = 0;
		if (root == null) {
			return result;
		} else if (root.left == null && root.right == null) {
			return 1;
		} else {
			return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
		}
	}
}
