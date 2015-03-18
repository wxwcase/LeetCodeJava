package medium.convertsortedarray2bst;

import common.datastruct.TreeNode;

public class Solution {

  /**
   * Given an array where elements are sorted in ascending order,
   * convert it to a height balanced BST.
   * @param num sorted array
   * @return balanced BST
   */
  public TreeNode sortedArrayToBST(int[] num) {
    return helper(num, 0, num.length);
  }
  
  private TreeNode helper(int[] num, int start, int end) {

    TreeNode root = null;
    
    if (end - start < 1) {
      return root;
    }

    int center = (end + start) / 2;
    root = new TreeNode(num[center]);
    root.left = helper(num, start, center);
    root.right = helper(num, center + 1, end);

    return root;
  }
}
