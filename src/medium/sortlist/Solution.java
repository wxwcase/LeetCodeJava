package medium.sortlist;

import common.datastruct.ListNode;

public class Solution {

  /**
   * Sort linked list. Recursive.
   * @param head head of list
   * @return sorted head of list
   */
  public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    
    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    
    ListNode head2 = slow.next;
    slow.next = null;
    head = sortList(head);
    head2 = sortList(head2);
    return merge(head, head2);
  }
  
  /**
   * Merge two sorted linked list.
   * @param node1 list one
   * @param node2 list two 
   * @return head of the two merged list
   */
  private ListNode merge(ListNode node1, ListNode node2) {

    if (node1 == null) {
      return node2;
    }

    if (node2 == null) {
      return node1;
    }
    if (node1.val < node2.val) {
      node1.next = merge(node1.next, node2);
      return node1;
    } else {
      node2.next = merge(node1, node2.next);
      return node2;
    }
  }
  
  
  /**
   * Sort linked list. Non-recursive.
   * @param head head of list
   * @return new sorted head of list
   */
  public ListNode sortList2(ListNode head) {
    
    if (head == null || head.next == null) {
      return head;
    }
    
    // get list length
    ListNode cur = head;
    int length = 0;
    while (cur != null) {
      cur = cur.next;
      length++;
    }
    
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode left, right, tail;
    for (int step = 1; step < length; step <<= 1) {
      cur = dummy.next;
      tail = dummy;
      while (cur != null) {
        left = cur;
        right = split(left, step);
        cur = split(right, step);
        tail = merge2(left, right, tail);
      }
    }
    return dummy.next;
  }
  
  /**
   * Divide the linked list into two lists, while
   * the first list contains first n nodes.
   * @param head list
   * @param n first n nodes
   * @return the second list's head
   */
  private ListNode split(ListNode head, int n) {
    for (int i = 1; head != null && i < n; i++) {
      head = head.next;
    }
    
    if (head == null) {
      return null;
    }
    
    ListNode second = head.next;
    head.next = null; // cut off the first part: n elements
    return second;
  }
  
  /**
   * Merge the two sorted linked list l1 and l2,
   * then append the merged sorted list to the node head.
   * @param l1 list one
   * @param l2 list two
   * @param head list node to be appended to
   * @return the tail of the merged sorted list;
   */
  private ListNode merge2(ListNode l1, ListNode l2, ListNode head) {
    ListNode cur = head;
    while (l1 != null && l2 != null) {
      if (l1.val > l2.val) {
        cur.next = l2;
        cur = l2;
        l2 = l2.next;
      } else {
        cur.next = l1;
        cur = l1;
        l1 = l1.next;
      }
    }
    cur.next = (l1 == null ? l2 : l1);
    while (cur.next != null) {
      cur = cur.next;
    }
    return cur;
  }
}
