package easy.MinStack;

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
	public void test1() {
		sol.push(0);
		sol.push(1);
		sol.push(0);
		assertEquals(0, sol.getMin());
		sol.pop();
		assertEquals(0, sol.getMin());
	}
	
	@Test
	public void test2() {
		sol.push(512);
		sol.push(-1024);
		sol.push(-1024);
		sol.push(512);
		sol.pop();
		assertEquals(-1024, sol.getMin());
		sol.pop();
		assertEquals(-1024, sol.getMin());
		sol.pop();
		assertEquals(512, sol.getMin());
	}
}
