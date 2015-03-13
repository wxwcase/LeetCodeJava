package medium.sumroot2pathnumber;

import java.util.ArrayList;
import java.util.List;

import common.datastruct.TreeNode;

public class Solution {
  
  List<String> results;
  StringBuffer buffer;

  /**
   * Given a binary tree containing digits from 0-9 only, each root-to-leaf
   * path could represent a number.
   * @param root binary tree root
   * @return sum of the numbers
   */
  public int sumNumbers(TreeNode root) {
    
    int result = 0;

    // root is null
    if (root == null) {
      return result;
    }

    // root exists
    results = new ArrayList<>();
    buffer = new StringBuffer();
    
    dfs(root, buffer);
    
    for (int i = 0; i < results.size(); i++) {
      result += Integer.valueOf(results.get(i));
    }

    return result;
  }
  
  /**
   * Visit nodes recursively.
   * @param node parent node to be visited
   * @param buffer storage to maintain current number
   */
  public void dfs(TreeNode node, StringBuffer buffer) {
    String currentVal = String.valueOf(node.val);
    buffer.append(currentVal);
    if (node.left != null) {
      dfs(node.left, buffer);
    } 
    if (node.right != null) {
      dfs(node.right, buffer);
    }
    if (node.left == null && node.right == null) {
      // add result to results array
      results.add(buffer.toString());
    }
    // delete last value in buffer
    buffer.delete(buffer.length() - currentVal.length(), buffer.length());
  }
}
