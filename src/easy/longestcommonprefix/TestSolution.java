package easy.longestcommonprefix;

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
	public void testHasEmptyString() {
		String str1[] = {"abc", "", "ab", "abcdefg"};
		String str2[] = {"", "", "", ""};
		String str3[] = {};
		String str4[] = {""};
		assertEquals("", sol.longestCommonPrefix(str1));
		assertEquals("", sol.longestCommonPrefix(str2));
		assertEquals("", sol.longestCommonPrefix(str3));
		assertEquals("", sol.longestCommonPrefix(str4));
	}
	
	@Test
	public void testNonEmptyStrings() {
		String str1[] = {"abcdefg", "abcdef", "abcde", "abc"};
		assertEquals("abc", sol.longestCommonPrefix(str1));
		
		String str2[] = {"123ABCdsadlfj", "123ABCloeijfn", "123AB", "123ABdfk"};
		assertEquals("123AB", sol.longestCommonPrefix(str2));
		
		String str3[] = {"a"};
		assertEquals("a", sol.longestCommonPrefix(str3));
	}
}
