package easy.RomanToInteger;

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
	public void testEmptyString() {
		String str = "";
		assertEquals(0, sol.romanToInt(str));
	}

	@Test 
	public void test2() {
		String str1 = "LXVI";
		String str2 = "CLXXIII";
		String str3 = "DCDLXXXI";
		String str4 = "CLXXIV";
		assertEquals(66, sol.romanToInt(str1));
		assertEquals(173, sol.romanToInt(str2));
		assertEquals(981, sol.romanToInt(str3));
		assertEquals(174, sol.romanToInt(str4));
	}
	@Test
	public void test1() {
		String str1 = "I";
		String str2 = "V";
		String str3 = "X";
		String str4 = "L";
		String str5 = "C";
		String str6 = "D";
		String str7 = "M";
		String str8 = "IV";
		String str9 = "IX";
		String str10 = "XL";
		String str11 = "XC";
		String str12 = "CD";
		String str13 = "CM";

		assertEquals(1, sol.romanToInt(str1));
		assertEquals(5, sol.romanToInt(str2));
		assertEquals(10, sol.romanToInt(str3));
		assertEquals(50, sol.romanToInt(str4));
		assertEquals(100, sol.romanToInt(str5));
		assertEquals(500, sol.romanToInt(str6));
		assertEquals(1000, sol.romanToInt(str7));
		assertEquals(4, sol.romanToInt(str8));
		assertEquals(9, sol.romanToInt(str9));
		assertEquals(40, sol.romanToInt(str10));
		assertEquals(90, sol.romanToInt(str11));
		assertEquals(400, sol.romanToInt(str12));
		assertEquals(900, sol.romanToInt(str13));
	}

}
