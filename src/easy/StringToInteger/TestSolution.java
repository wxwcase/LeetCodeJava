package easy.StringToInteger;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
	
	private Solution sol = null;
	
	@Before
	public void setup() {
		sol = new Solution();
	}
	
	@After
	public void teardown() {
		sol = null;
	}

	@Test 
	public void testInvalidString() {
		String str1 = "12i34";
		String str2 = "i123";
		String str3 = "12300i";
		assertEquals(12, sol.atoi(str1));
		assertEquals(0, sol.atoi(str2));
		assertEquals(12300, sol.atoi(str3));
	}

	@Test
	public void testEmptyCase() {
		String str = "";
		assertEquals(0, sol.atoi(str));
	}
	
	@Test
	public void testPositive() {
		String str1 = "0";
		String str2 = "+1";
		String str3 = "10";
		String str4 = "29";
		String str5 = "2147483647";
		String str6 = "2147483648";
		String str7 = "9223372036854775809";
		assertEquals(0, sol.atoi(str1));
		assertEquals(1, sol.atoi(str2));
		assertEquals(10, sol.atoi(str3));
		assertEquals(29, sol.atoi(str4));
		assertEquals(2147483647, sol.atoi(str5));
		assertEquals(Integer.MAX_VALUE, sol.atoi(str6));
		assertEquals(Integer.MAX_VALUE, sol.atoi(str7));
	}
	
	@Test
	public void testNegative() {
		String str1 = "-1";
		String str2 = "-29";
		String str3 = "-30";
		String str4 = "-2147483648";
		String str5 = "-2147483650";
		assertEquals(-1, sol.atoi(str1));
		assertEquals(-29, sol.atoi(str2));
		assertEquals(-30, sol.atoi(str3));
		assertEquals(-2147483648, sol.atoi(str4));
		assertEquals(Integer.MIN_VALUE, sol.atoi(str5));
	}
	
	@Test
	public void testUntrimmedString() {
		String str1 = "  010";
		String str2 = "   1";
		String str3 = "  -0012a42";
		assertEquals(10, sol.atoi(str1));
		assertEquals(1, sol.atoi(str2));
		assertEquals(-12, sol.atoi(str3));
	}
}
