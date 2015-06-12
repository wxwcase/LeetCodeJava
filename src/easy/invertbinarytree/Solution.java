package easy.invertbinarytree;

import common.datastruct.TreeNode;

public class Solution {

  /**
   * Invert a binary tree
   *      4
   *     /  \
   *    2    7
   *   / \  / \
   *  1   36   9
   *  to
   *      4
   *     /  \
   *    7    2
   *   / \  / \
   *  9   63   1.
   * @param root binary tree root
   * @return the inverted tree root
   */
  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }
    TreeNode left = root.left;
    TreeNode right = root.right;
    root.left = invertTree(right);
    root.right = invertTree(left);
    return root;
  }
}
