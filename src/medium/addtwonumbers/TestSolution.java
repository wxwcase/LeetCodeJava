package medium.addtwonumbers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import common.datastruct.ListNode;

public class TestSolution {
  
  private Solution sol;

  @Before
  public void setup() {
   sol = new Solution();
  }

  @After
  public void teardown() {
    sol = null;
  }

  @Test
  public void test() {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(9);
    l2.next = new ListNode(9);
    assertEquals("0 0 1", TestSolution.printList(sol.addTwoNumbers(l1, l2)));
  }

  public static String printList(ListNode l1) {
    StringBuffer sb = new StringBuffer();
    while (l1 != null) {
      sb.append(l1.val);
      sb.append(' ');
      l1 = l1.next;
    }
    sb.deleteCharAt(sb.length() - 1);
//    System.out.println(sb);
    return sb.toString();
  }
}
