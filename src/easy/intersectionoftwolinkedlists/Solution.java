package easy.intersectionoftwolinkedlists;

import common.datastruct.ListNode;

public class Solution {

	/**
	 * Find the node at which the intersection of two singly linked lists begins
	 * The linked lists must retain their original structure after the function returns
	 * You may assume there are no cycles anywhere in the entire linked structure
	 * Time: O(n), Space: O(1)
	 * @param headA
	 * @param headB
	 * @return If the two linked lists have no intersection at all, return null
	 */
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		// 1. Find two lists' lengths
		// 2. walk to the same spot(if needed) where the two lists will eventually meet at the same end spot
		// 3. walk both at same pace to find the same 'next' element
		if (headA == null || headB == null) {
			return null;
		}
		int len1 = 1, len2 = 1;
		ListNode walkA = headA, walkB = headB;
		while(walkA.next != null) {
			walkA = walkA.next;
			len1++;
		}
		while(walkB.next != null) {
			walkB = walkB.next;
			len2++;
		}
		walkA = headA;
		walkB = headB;
		
		int delta = Math.abs(len1 - len2);
		if (len1 < len2) {
			for (int i = 0; i < delta; i++) {
				walkB = walkB.next;
			}
			while(walkA != walkB) {
				walkA = walkA.next;
				walkB = walkB.next;
			}
			if(walkA == walkB) {
				return walkA;
			} else {
				return null;
			}
		} else {
			for (int i = 0; i < delta; i++) {
				walkA = walkA.next;
			}
			while(walkA != walkB) {
				walkA = walkA.next;
				walkB = walkB.next;
			}
			if(walkA == walkB) {
				return walkA;
			} else {
				return null;
			}
		}
	}
}
