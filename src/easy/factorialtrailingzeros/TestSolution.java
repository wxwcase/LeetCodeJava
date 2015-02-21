package easy.factorialtrailingzeros;

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
		int n1 = 0;
		int n2 = 1;
		int n3 = 10;
		int n4 = 19;
		int n5 = 20;
		assertEquals(0, sol.trailingZeroes(n1));
		assertEquals(0, sol.trailingZeroes(n2));
		assertEquals(2, sol.trailingZeroes(n3));
		assertEquals(3, sol.trailingZeroes(n4));
		assertEquals(4, sol.trailingZeroes(n5));
	}
	
}
