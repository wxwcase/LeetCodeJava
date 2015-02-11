package easy.ZigZagConversion;

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
	public void testThreeRows() {
		int nRows = 3;
		String b = "PAYPALISHIRING";
		String r = "PAHNAPLSIIGYIR";
		assertEquals(r, sol.convert(b, nRows));
	}
	
	@Test 
	public void testEmptyString() {
		int nRows = 1;
		String a = "";
		String b = "";
		assertEquals(b, sol.convert(a, nRows));
	}
	
	@Test
	public void testFiveRows() {
		int nRows = 5;
		String a = "";
		String r = "";
		assertEquals(r, sol.convert(a, nRows));
	}
}
