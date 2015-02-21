package easy.excelsheetcolumntitle;

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
	public void testInvalidNumber() {
		int a1 = 0;
		int a2 = -1;
		assertEquals("", sol.convertToTitle(a1));
		assertEquals("", sol.convertToTitle(a2));
	}
	@Test 
	public void testSingleLetter() {
		int a1 = 1;
		int a2 = 2;
		int a3 = 26;
		assertEquals("A", sol.convertToTitle(a1));
		assertEquals("B", sol.convertToTitle(a2));
		assertEquals("Z", sol.convertToTitle(a3));
	}
	
	@Test 
	public void testMultipleLetters() {
		int a1 = 53;
		int a2 = 27;
		int a3 = 28;
		int a4 = 52;
		assertEquals("AA", sol.convertToTitle(a2));
		assertEquals("AB", sol.convertToTitle(a3));
		assertEquals("BA", sol.convertToTitle(a1));
		assertEquals("AZ", sol.convertToTitle(a4));
	}
}
