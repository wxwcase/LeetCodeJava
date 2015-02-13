package easy.ValidPalindrome;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
	
	private Solution sol = null;

	@Before
	public void setUp() throws Exception {
		sol = new Solution();
	}

	@After
	public void tearDown() throws Exception {
		sol = null;
	}
	
	@Test
	public void testRegularizeString() {
		String s1 = "ABC";
		String s2 = "ab, c'b &a";
		assertEquals("abc", sol.regularize(s1));
		assertEquals("abcba", sol.regularize(s2));
	}

	@Test
	public void test() {
		String str1 = "a";
		String str2 = "abcba";
		String str3 = "aBcBA";
		String str4 = "ab, c'b *a";
		assertTrue(sol.isPalindrome(str1));
		assertTrue(sol.isPalindrome(str2));
		assertTrue(sol.isPalindrome(str3));
		assertTrue(sol.isPalindrome(str4));
	}
	
	@Test
	public void testEmptyString() {
		String str = "";
		assertTrue(sol.isPalindrome(str));
	}
}
