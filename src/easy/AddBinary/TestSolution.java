package easy.AddBinary;

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
		String a1 = "0";
		String a2 = "1";
		String a3 = "10";
		String a4 = "11";
		String a5 = "100";
		String a6 = "101";
		String a7 = "110";
		String a8 = "1010";
		String a9 = "1011";
		
		assertEquals("1", sol.addBinary(a1, a2));
		assertEquals("11", sol.addBinary(a2, a3));
		assertEquals("100", sol.addBinary(a2, a4));
		assertEquals("101", sol.addBinary(a2, a5));
		assertEquals("101", sol.addBinary(a3, a4));
		assertEquals("1011", sol.addBinary(a6, a7));
		assertEquals("10101", sol.addBinary(a8, a9));
	}
	
	@Test
	public void testEmpty() {
		String a = "";
		String b = "";
		assertEquals("", sol.addBinary(a, b));
	}
}
