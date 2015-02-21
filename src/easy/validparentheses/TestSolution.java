package easy.validparentheses;

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
        String s1 = "({}[]())";
        String s2 = "(){}[][)";
        String s3 = "]";
        String s4 = "]]";
        assertTrue(sol.isValid(s1));
        assertFalse(sol.isValid(s2));
        assertFalse(sol.isValid(s3));
        assertFalse(sol.isValid(s4));
    }
}
