package easy.BinaryTreeLevelOrderTraversalII;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import common.datastruct.TreeNode;

public class Solution {
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> list = new LinkedList<>();
		if (root == null) {
			return list;
		}
		queue.add(root);
		queue.add(null);
		List<Integer> tempList = new LinkedList<>();
		while(!queue.isEmpty()) {
			TreeNode temp = queue.remove();
			if (temp == null) {
				list.add(0, tempList);
				if (!queue.isEmpty()) {
					queue.add(null);
					tempList = new LinkedList<>();
				}
			} else {
				tempList.add(temp.val);
				if (temp.left != null) {
					queue.add(temp.left);
				}
				if (temp.right != null) {
					queue.add(temp.right);
				}
			}
		}
		
		return list;
	}
}
