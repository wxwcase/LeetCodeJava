package easy.majorityelement;

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
		int[] array = {1, 2, 3, 4, 5, 1};
		assertEquals(1, sol.majorityElement(array));
	}
	
	@Test
	public void test2() {
		int[] array = {-1, 1, 1, 1, 2, 1};
		assertEquals(1, sol.majorityElement(array));
	}
}
