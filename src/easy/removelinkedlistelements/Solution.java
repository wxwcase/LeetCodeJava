package easy.removelinkedlistelements;

import common.datastruct.ListNode;

public class Solution {

  /**
   * Remove all elements from a linked list of integers that have value val.
   * @param head head of the linked list.
   * @param val node with this value should be removed
   * @return the new list head
   */
  public ListNode removeElements(ListNode head, int val) {
    if (head == null) {
      return head;
    }
    // find new head
    while (head != null && head.val == val) {
      head = head.next;
    }
    // first non 'val' or null head
    ListNode past = head;
    ListNode ptr;
    if (past != null) { // head exists
      ptr = past.next;
    } else {            // head does not exists
      return null;
    }

    if (past.val == val) {
      past = ptr;
    }

    while (ptr != null) {
      if (ptr.val == val) {
        ptr = ptr.next;
        past.next = ptr;
      } else {
        past = ptr;
        ptr = ptr.next;
      }
    }
    return head;
  }
}
