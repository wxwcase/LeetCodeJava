package easy.BinaryTreeLevelOrderTraversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import common.datastruct.TreeNode;

public class Solution {

	public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> list = new LinkedList<>();
		if (root == null) {
			return list;
		}
		List<Integer> tmpList = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		while(!queue.isEmpty()) {
			TreeNode tmp = queue.remove();
			if (tmp == null) {
				list.add(tmpList);
				if (!queue.isEmpty()) {
					queue.add(null);
					tmpList = new LinkedList<>();
				}
			} else {
				tmpList.add(tmp.val);
				if (tmp.left != null) {
					queue.add(tmp.left);
				}
				if (tmp.right != null) {
					queue.add(tmp.right);
				}
			}
		}
		return list;
	}
}
