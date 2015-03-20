package medium.swapnodesinpairs;

import common.datastruct.ListNode;

public class Solution {

  /**
   * Given a linked list, swap every two adjacent nodes and return its head.
   * Use only constant space.
   * @param head head of the list
   * @return the modified list
   */
  public ListNode swapPairs(ListNode head) {
    
    ListNode cur = head;
    
    // zero or one node
    if (head == null || head.next == null) {
      return cur;
    }
    
    // more than one node
    ListNode pre = null;
    ListNode nex = cur.next; 
    head = cur.next;
    
    while (cur != null) {
      nex = cur.next;
      if (nex == null) {
        break;
      }
      cur.next = nex.next;
      nex.next = cur;
      if (pre != null) {
        pre.next = nex;
      }
      pre = cur;
      cur = cur.next;
    }

    return head;
  }
}
