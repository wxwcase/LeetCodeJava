package medium.addtwonumbers;

import common.datastruct.ListNode;

public class Solution {

  /**
   * Given two linked lists representing two non-negative numbers. 
   * The digits are stored in reverse order and each of their nodes 
   * contain a single digit. Add the two numbers and return it as a linked list.
   * @param l1 list one
   * @param l2 list two
   * @return head of result list
   */
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode walk1 = l1; 
    ListNode walk2 = l2;
    boolean mark = false;  // marker for digit larger than 9
    ListNode res = null;
    ListNode walk = res;
    int val;
    
    while (walk1 != null || walk2 != null) {
      val = 0;
      if (walk1 != null) {
        val += walk1.val;
      }
      if (walk2 != null) {
        val += walk2.val;
      }
      if (mark) {
        val++;
        mark = false;
      }
      if (val > 9) {
        val -= 10;
        mark = true;
      }
      if (walk != null) {
        walk.next = new ListNode(val);
        walk = walk.next;
      } else {
        walk = new ListNode(val);
        res = walk;
      }
      if (walk1 != null) {
        walk1 = walk1.next;
      }
      if (walk2 != null) {
        walk2 = walk2.next;
      }
    }
    if (mark) {
      walk.next = new ListNode(1);
    }
    return res;
  }
}
