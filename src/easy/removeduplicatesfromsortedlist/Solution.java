package easy.removeduplicatesfromsortedlist;

import common.datastruct.ListNode;

public class Solution {
	
	/**
	 * Given a sorted linked list, delete all duplicates such that each
	 * element appear only once
	 * @param head
	 * @return
	 */
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return null;
		} else if (head.next == null) {
			return head;
		}
		ListNode cur = head.next;
		ListNode pre = head;
		while (cur != null) {
			if (cur.val == pre.val) {
				// delete cur
				pre.next = cur.next;
				cur = cur.next;
			} else {
				pre = cur;
				cur = cur.next;
			}
		}
		return head;
	}
}
