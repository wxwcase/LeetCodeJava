package easy.palindromenumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
	
	private Solution sol = null;
	
	@Before
	public void setup() {
		sol = new Solution();
	}
	
	@After
	public void teardown() {
		sol = null;
	}

	@Test
	public void testNegative() {
		int a = -1;
		assertFalse(sol.isPalindrome(a));
	}
	
	@Test
	public void test() {
		int a1 = 1001;
		int a2 = 10001;
		int a3 = 120021;
		int a4 = 123;
		int a5 = 22;
		assertTrue(sol.isPalindrome(a1));
		assertTrue(sol.isPalindrome(a2));
		assertTrue(sol.isPalindrome(a3));
		assertFalse(sol.isPalindrome(a4));
		assertTrue(sol.isPalindrome(a5));
	}
	
	@Test 
	public void testwidth() {
		int a1 = 0;
		int a2 = 9;
		int a3 = 10;
		int a4 = 111;
		assertEquals(1, sol.width(a1));
		assertEquals(1, sol.width(a2));
		assertEquals(2, sol.width(a3));
		assertEquals(3, sol.width(a4));
	}
	
	@Test 
	public void testNumAtIndex() {
		int a1 = 1000;
		int a2 = 10101;
		int a3 = 1122334;
		assertEquals(0, sol.numAtIndex(a1, 0));
		assertEquals(0, sol.numAtIndex(a1, 1));
		assertEquals(0, sol.numAtIndex(a1, 2));
		assertEquals(1, sol.numAtIndex(a1, 3));
		assertEquals(1, sol.numAtIndex(a2, 0));
		assertEquals(0, sol.numAtIndex(a2, 1));
		assertEquals(1, sol.numAtIndex(a2, 2));
		assertEquals(0, sol.numAtIndex(a2, 3));
		assertEquals(1, sol.numAtIndex(a2, 4));
		assertEquals(4, sol.numAtIndex(a3, 0));
		assertEquals(3, sol.numAtIndex(a3, 1));
		assertEquals(3, sol.numAtIndex(a3, 2));
		assertEquals(2, sol.numAtIndex(a3, 3));
		assertEquals(2, sol.numAtIndex(a3, 4));
		assertEquals(1, sol.numAtIndex(a3, 5));
		assertEquals(1, sol.numAtIndex(a3, 6));
	}
}
