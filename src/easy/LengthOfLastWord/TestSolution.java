package easy.LengthOfLastWord;

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
	public void test() {
		String s1 = "1";
		String s2 = " 1 ";
		String s3 = "new";
		String s4 = "new word";
		String s5 = "new word.";
		String s6 = "This is a new line  ";
		assertEquals(1, sol.lengthOfLastWord(s1));
		assertEquals(1, sol.lengthOfLastWord(s2));
		assertEquals(3, sol.lengthOfLastWord(s3));
		assertEquals(4, sol.lengthOfLastWord(s4));
		assertEquals(5, sol.lengthOfLastWord(s5));
		assertEquals(4, sol.lengthOfLastWord(s6));
	}
	
	@Test 
	public void testEmpty() {
		String s1 = "";
		int l1 = 0;
		assertEquals(l1, sol.lengthOfLastWord(s1));
	}
}
