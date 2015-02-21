package easy.minimumdepthofbinarytree;

import common.datastruct.TreeNode;

public class Solution {
	
	/**
	 * TODO
	 * @param root
	 * @return
	 */
	public int minDepth(TreeNode root) {
		if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
			return 1;
        } else if (root.left == null && root.right != null) {
            return 1 + minDepth(root.right);
        } else if (root.left != null && root.right == null) {
            return 1 + minDepth(root.left);
		} else {
			return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
		}
	}
}