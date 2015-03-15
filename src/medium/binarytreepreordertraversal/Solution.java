package medium.binarytreepreordertraversal;

import java.util.ArrayList;
import java.util.List;

import common.datastruct.TreeNode;

public class Solution {

  /**
   * Given a binary tree, return the preorder traversal of its 
   * nodes' values.
   * @param root root of the tree
   * @return preorder of its value
   */
  public List<Integer> preorderTraversal(TreeNode root) {

    List<Integer> result = new ArrayList<>();

    if (root == null) {
      return result;
    }
    
    result.add(root.val);
    result.addAll(preorderTraversal(root.left));
    result.addAll(preorderTraversal(root.right));

    return result;
  }
}
