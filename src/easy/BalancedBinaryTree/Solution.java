package easy.BalancedBinaryTree;

public class Solution {
	
	/**
	 * - Given a binary tree, determine if it is height-balanced.
	 * - For this problem, a height-balanced binary tree is defined as a 
	 *	 binary tree in which the depth of the two subtrees of every node 
	 *	 never differ by more than 1.
	 * @param root
	 * @return
	 */
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		} else if (Math.abs(findDepth(root.left) - findDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
			return true;
		}
		return false;
	}
	
	public int findDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + Math.max(findDepth(root.left), findDepth(root.right));
		}
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}