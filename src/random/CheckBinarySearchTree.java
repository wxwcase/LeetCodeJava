package random;

import common.datastruct.TreeNode;

public class CheckBinarySearchTree {

  /**
   * Check if the tree is a valid Binary Search Tree.
   * Time complexity: O(N)
   * @param root tree root
   * @return true if it is valid
   */
  public boolean isValidBinarySearchTree(TreeNode root) {
    return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
  
  private boolean isValid(TreeNode root, int min, int max) {
    if (root == null) {
      return true;
    }
    if (root.val > min 
        && root.val < max 
        && isValid(root.left, min, Math.min(root.val, max)) 
        && isValid(root.right, Math.max(root.val, min), max)) {
      return true;
    } else {
      return false;
    }
  }
}
