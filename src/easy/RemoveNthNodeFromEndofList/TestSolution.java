package easy.RemoveNthNodeFromEndofList;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import common.datastruct.ListNode;

public class TestSolution {
	
	private Solution sol = null;
	ListNode n1 = new ListNode(1);
	ListNode n2 = new ListNode(2);
	ListNode n3 = new ListNode(3);
	ListNode n4 = new ListNode(4);
	ListNode n5 = new ListNode(5);
	List<Integer> list = null;
	ListNode head = null;
	
	@Before
	public void setUp() throws Exception {
		sol = new Solution();
		list = new ArrayList<>();
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		head = n1;
	}

	@After
	public void tearDown() throws Exception {
		sol = null;
	}
	
	@Test
	public void testPringList() {
		list.add(n1.val);
		list.add(n2.val);
		list.add(n3.val);
		list.add(n4.val);
		list.add(n5.val);
		ListNode head = n1;
		sol.printList(head);
		assertEquals(list, sol.printList(head));
	}

	@Test
	public void test() {
		list.add(n1.val);
		list.add(n2.val);
		list.add(n3.val);
		list.add(n5.val);

		assertEquals(list, sol.printList(sol.removeNthFromEnd(head, 2)));
	}
	
	@Test
	public void testSingleItemList() {
		head = n5;
		assertEquals(list, sol.printList(sol.removeNthFromEnd(head, 1)));
	}

}
