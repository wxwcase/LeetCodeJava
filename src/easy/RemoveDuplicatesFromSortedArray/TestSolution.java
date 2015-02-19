package easy.RemoveDuplicatesFromSortedArray;

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
		int a1 = 1;
		int A1[] = {1, 1};
		assertEquals(a1, sol.removeDuplicates(A1));
	}
	
	@Test 
	public void test2() {
		int a1 = 1;
		int A1[] = {1, 1, 1};
		int A2[] = {1, 1, 1, 1};
		int A3[] = {1, 1, 1, 1, 1};
		assertEquals(a1, sol.removeDuplicates(A1));
		assertEquals(a1, sol.removeDuplicates(A2));
		assertEquals(a1, sol.removeDuplicates(A3));
	}

}
