package easy.reverselinkedlist;

import common.datastruct.ListNode;

public class Solution {

  /**
   * Reverse a linked list.
   * @param head head node
   * @return the new head node
   */
  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return head;
    }
    
    ListNode previousNode = head;
    ListNode currentNode = head.next;
    ListNode nextNode = null;
    
    previousNode.next = null;
    
    while (currentNode != null) {
      nextNode = currentNode.next;
      currentNode.next = previousNode;
      previousNode = currentNode;
      currentNode = nextNode;
    }
    
    return previousNode;
  }
}
