package easy.SymmetricTree;

import java.util.LinkedList;

import common.datastruct.TreeNode;

public class Solution {
	// Recursive
	/**
	 * Given a binary tree, check whether it is a mirror of itself(ie,
	 * symmetric around its center).
	 * @param root
	 * @return
	 */
	public boolean isSymmetric(TreeNode root) {
		return root == null || isSymmetricBetweenTwo(root.left, root.right);
	}
	
	private boolean isSymmetricBetweenTwo(TreeNode left, TreeNode right) {
		if (left == null || right == null) {
			return left == right;
		}
		if (left.val != right.val) {
			return false;
		}
		return isSymmetricBetweenTwo(left.left, right.right) &&
				isSymmetricBetweenTwo(left.right, right.left);
	}
}

class Solution2 {
	
	/**
	 * Non-recursive
	 * @param root
	 * @return
	 */
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		LinkedList<TreeNode> stack = new LinkedList<>();
		stack.push(root.left);
		stack.push(root.right);
		while(!stack.isEmpty()) {
			TreeNode node1 = stack.pop();
			TreeNode node2 = stack.pop();
			if (node1 == null && node2 == null) {
				continue;
			}
			if (node1 == null || node2 == null) {
				return false;
			}
			if (node1.val != node2.val) {
				return false;
			}
			stack.push(node1.left);
			stack.push(node2.right);
			stack.push(node1.right);
			stack.push(node2.left);
		}
		return true;
	}
}