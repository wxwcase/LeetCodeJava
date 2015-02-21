package easy.implementstrstr;

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
	public void testEmpty() {
		String a1 = "";
		String a2 = "a";
		assertEquals(0, sol.strStr(a1, a1));	
		assertEquals(0, sol.strStr(a2, a1));	
	}
	
	@Test
	public void test() {
		String a1 = "a";
		String a2 = "aa";
		String a3 = "abc";
		String a4 = "bca abc";
		String a5 = "new word";
		String a6 = "word";
		String a7 = "mississippi";
		String a8 = "issipi";
		String a9 = "issip";
		
		assertEquals(0, sol.strStr(a1, a1));
		assertEquals(0, sol.strStr(a2, a1));
		assertEquals(-1, sol.strStr(a3, a2));
		assertEquals(2, sol.strStr(a4, a1));
		assertEquals(4, sol.strStr(a5, a6));
		assertEquals(-1, sol.strStr(a7, a8));
		assertEquals(4, sol.strStr(a7, a9));
	}

}
