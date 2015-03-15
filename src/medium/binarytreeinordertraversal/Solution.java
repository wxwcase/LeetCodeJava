package medium.binarytreeinordertraversal;

import java.util.ArrayList;
import java.util.List;

import common.datastruct.TreeNode;

public class Solution {

  /**
   * Given a binary tree, return the inorder traversal of its nodes' 
   * values.
   * @param root root of tree
   * @return inorder values
   */
  public List<Integer> inorderTraversal(TreeNode root) {
    
    List<Integer> result = new ArrayList<>();
    
    if (root == null) {
      return result;
    }
    
    result.addAll(inorderTraversal(root.left));
    result.add(root.val);
    result.addAll(inorderTraversal(root.right));

    return result;
  }
}
