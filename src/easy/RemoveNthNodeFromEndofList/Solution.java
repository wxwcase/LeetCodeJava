package easy.RemoveNthNodeFromEndofList;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	/**
	 * Given a linked list, remove the nth node from the end of list
	 * and return its head. Do this in one pass.
	 * @param head
	 * @param n
	 * @return
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
		// empty list
		if (head == null) {
			return null;
		}  else if(head.next == null) {
			if (n == 1) {
				return null;
			}
		}

		// keep distance between walk node and current node, 
		// current node is to be deleted
		ListNode prev = null;
		ListNode current = head;
		ListNode walk = head;
		for (int i = 0; i < n - 1; i++) {
			walk = walk.next;
		}
		while (walk.next != null) {
			walk = walk.next;
			prev = current;
			current = current.next;
		}

		// remove current node
		if (prev != null) {
			prev.next = current.next;
		} else {
			head = current.next;
		}
		current.next = null;
		current = null;
		return head;
	}
	
	public List<Integer> printList(ListNode head) {
		List<Integer> list = new ArrayList<>();
		while(head != null) {
			list.add(head.val);
			head = head.next;
		}
		return list;
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}