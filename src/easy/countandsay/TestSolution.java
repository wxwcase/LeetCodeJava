package easy.countandsay;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
	
	private Solution sol;
	
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
        int a1 = 1;
        int a2 = 3;
        int a3 = 5;
        int a4 = 6;
        assertEquals(sol.countAndSay(a1), "1");
        assertEquals(sol.countAndSay(a2), "21");
        assertEquals(sol.countAndSay(a3), "111221");
        assertEquals(sol.countAndSay(a4), "312211");
    }
	
	@Test(timeout=1000)
	public void testWithTimeout() {
		int a1 = 20;
		sol.countAndSay(a1);
	}
}
