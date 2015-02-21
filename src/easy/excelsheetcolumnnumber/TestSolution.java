package easy.excelsheetcolumnnumber;

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
	public void testEmptyTitle() {
		String emptyTitle = "";
		assertEquals(0, sol.titleToNumber(emptyTitle));
	}
	
	@Test
	public void testSingleColumnTitle() {
		String t1 = "A";
		String t2 = "B";
		String t3 = "Z";
		assertEquals(1, sol.titleToNumber(t1));
		assertEquals(2, sol.titleToNumber(t2));
		assertEquals(26, sol.titleToNumber(t3));
	}
	
	@Test
	public void testDoubleColumnTitle() {
		String t1 = "AA";
		String t2 = "AB";
		String t3 = "AZ";
		assertEquals(27, sol.titleToNumber(t1));
		assertEquals(28, sol.titleToNumber(t2));
		assertEquals(52, sol.titleToNumber(t3));
	}
}
