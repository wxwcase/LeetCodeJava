package easy.compareversionnumbers;

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
		String version1 = "0.1";
		String version2 = "0.2";
		String version3 = "0.0.1";
		String version4 = "1.0.1";
		String version5 = "2";
		String version6 = "3.0.0.1";
		String version7 = "1.0.1.0.1";
		assertEquals(-1, sol.compareVersion(version1, version2));
		assertEquals(1, sol.compareVersion(version1, version3));
		assertEquals(-1, sol.compareVersion(version1, version4));
		assertEquals(-1, sol.compareVersion(version1, version5));
		assertEquals(-1, sol.compareVersion(version1, version6));
		assertEquals(-1, sol.compareVersion(version1, version7));
		assertEquals(1, sol.compareVersion(version2, version3));
		assertEquals(-1, sol.compareVersion(version2, version4));
		assertEquals(-1, sol.compareVersion(version2, version5));
		assertEquals(-1, sol.compareVersion(version2, version6));
		assertEquals(-1, sol.compareVersion(version2, version7));
		assertEquals(-1, sol.compareVersion(version3, version4));
		assertEquals(-1, sol.compareVersion(version3, version5));
		assertEquals(-1, sol.compareVersion(version3, version6));
		assertEquals(-1, sol.compareVersion(version3, version7));
		assertEquals(-1, sol.compareVersion(version4, version5));
		assertEquals(-1, sol.compareVersion(version4, version6));
		assertEquals(-1, sol.compareVersion(version4, version7));
		assertEquals(-1, sol.compareVersion(version5, version6));
		assertEquals(1, sol.compareVersion(version5, version7));
		assertEquals(1, sol.compareVersion(version6, version7));
		assertEquals(0, sol.compareVersion(version6, version6));
	}

	private void assertEquals(int i, int compareVersion) {
		// TODO Auto-generated method stub
		
	}
}
