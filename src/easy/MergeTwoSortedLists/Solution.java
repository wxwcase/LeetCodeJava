package easy.MergeTwoSortedLists;

import common.datastruct.ListNode;

public class Solution {
	
	/**
	 * Merge two sorted linked lists and return it as a new list
	 * The new list should be made by splicing together the nodes of the first two lists
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}
		ListNode head = null, walk = null;
		if (l1.val < l2.val) {
			head = l1;
			l1 = l1.next;
		} else {
			head = l2;
			l2 = l2.next;
		}
		walk = head;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				walk.next = l1;
				l1 = l1.next;
			} else {
				walk.next = l2;
				l2 = l2.next;
			}
			walk = walk.next;
		}
		
		while (l1 != null) {
			walk.next = l1;
			l1 = l1.next;
			walk = walk.next;
		}
		
		while (l2 != null) {
			walk.next = l2;
			l2 = l2.next;
			walk = walk.next;
		}
		return head;
	}
}
