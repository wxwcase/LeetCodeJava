package medium.populatingnextrightpointerineachnode;

import java.util.LinkedList;

import common.datastruct.TreeLinkNode;

public class Solution {

  /**
   * Given a binary tree, populate each next pointer to its next
   * right node.
   * Level order traversal
   * @param root root of the binary tree
   */
  public void connect(TreeLinkNode root) {

    LinkedList<TreeLinkNode> queue = new LinkedList<>();
    LinkedList<TreeLinkNode> stack = new LinkedList<>();
    
    if (root != null) {
      queue.offer(root);
      queue.offer(null);
      while (!queue.isEmpty()) {
        TreeLinkNode tmp = queue.poll();
        stack.push(tmp);
        if (tmp != null) {
          if (tmp.left != null) {
            queue.offer(tmp.left);
          }
          if (tmp.right != null) {
            queue.offer(tmp.right);
          }
        } else if (!queue.isEmpty()){
          queue.offer(null);
        }
      }
      
      TreeLinkNode next = stack.pop();
      while (!stack.isEmpty()) {
        TreeLinkNode curr = stack.pop();
        if (curr != null) {
          curr.next = next;
        }
        next = curr;
      }
    }
  }
}
