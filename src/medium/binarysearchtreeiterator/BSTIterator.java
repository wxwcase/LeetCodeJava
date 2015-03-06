package medium.binarysearchtreeiterator;

import java.util.LinkedList;

import common.datastruct.TreeNode;

public class BSTIterator {
  
  LinkedList<TreeNode> stack = new LinkedList<>();
  TreeNode minPtr = null; 
  
  /**
   * Default constructor.
   * @param root tree root
   */
  public BSTIterator(TreeNode root) {
    if (root != null) {
      stack.push(root);
      minPtr = root.left;
      while (minPtr != null) {
        stack.push(minPtr);
        minPtr = minPtr.left;
      }
      minPtr = stack.peek();
    }
  }
  
  public boolean hasNext() {
    return !stack.isEmpty();
  }
  
  /**
   * Find the next samllest node.
   * @return the next smallest node value
   */
  public int next() {
    minPtr = stack.pop();
    int result = minPtr.val;
    if (minPtr.right != null) {
      minPtr = minPtr.right;
      stack.push(minPtr);
      minPtr = minPtr.left;
      while (minPtr != null) {
        stack.push(minPtr);
        minPtr = minPtr.left;
      }
      minPtr = stack.peek();
    } else if (hasNext()) {
      minPtr = stack.peek();
    } 
    return result;
  }
}
