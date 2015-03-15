package medium.linkedlistcycle;

import common.datastruct.ListNode;

public class Solution {

  /**
   * Given a linked list, determine if it has a cycle in it.
   * @param head first node of the list
   * @return true if the list has cycle
   */
  public boolean hasCycle(ListNode head) {

    if (head == null) {
      return false;
    }

    ListNode slow = head;
    ListNode fast = head;

    fast = fast.next;
    if (fast == null) {
      return false;
    }

    while (slow != fast && slow != null && fast != null) {
      fast = fast.next;
      if (fast == null) {
        return false;
      } else {
        slow = slow.next;
        fast = fast.next;
      }
    }
    if (slow == fast) {
      return true;
    } else {
      return false;
    }
  }
}
