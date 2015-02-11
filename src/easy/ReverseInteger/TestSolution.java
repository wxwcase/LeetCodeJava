package easy.ReverseInteger;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
	
	private Solution sol = null;

	@Before
	public void setUp() {
		sol = new Solution();
	}
	
	@After
	public void tearDown() {
		sol = null;
	}

	@Test
	public void test() {
		int a1 = 0;
		int a2 = 1;
		int a3 = 123;
		int a4 = -123;
		int a5 = 12000;
		int a6 = -12000;
		int a7 = 1534236469;
		int a8 = -2147483648;
		assertEquals(sol.reverse(a1), 0);
		assertEquals(sol.reverse(a2), 1);
		assertEquals(sol.reverse(a3), 321);
		assertEquals(sol.reverse(a4), -321);
		assertEquals(sol.reverse(a5), 21);
		assertEquals(sol.reverse(a6), -21);
		assertEquals(sol.reverse(a7), 0);
		assertEquals(sol.reverse(a8), 0);
	}

}
