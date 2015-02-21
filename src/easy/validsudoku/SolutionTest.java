package easy.validsudoku;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
	
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
	public void testUnitValid() {
		char[] a1 = {'0', '.', '.', '1', '9', '4', '.', '.', '2'};
		char[] a2 = {'0', '1', '.', '1', '9', '4', '.', '.', '2'};
		char[] a3 = {'0', '2', '.', '1', '9', '4', '.', '.', '2'};
		char[] a4 = {'0', '3', '.', '1', '9', '4', '.', '.', '2'};
		char[] a5 = {'.', '.', '.', '.', '.', '.', '.', '.', '.'};
		char[] a6 = {'2', '.', '.', '.', '.', '.', '.', '.', '.'};
		char[] a7 = {'.', '8', '7', '6', '5', '4', '3', '2', '1'};
		assertTrue(sol.isValidUnit(a1));
		assertTrue(sol.isValidUnit(a4));
		assertFalse(sol.isValidUnit(a2));
		assertFalse(sol.isValidUnit(a3));
		assertTrue(sol.isValidUnit(a5));
		assertTrue(sol.isValidUnit(a6));
		assertTrue(sol.isValidUnit(a7));
	}
	
	@Test
	public void testBoard() {
		char[][] b1 = {{'.', '8', '7', '6', '5', '4', '3', '2', '1'},
		               {'2', '.', '.', '.', '.', '.', '.', '.', '.'},
		               {'3', '.', '.', '.', '.', '.', '.', '.', '.'},
		               {'4', '.', '.', '.', '.', '.', '.', '.', '.'},
		               {'5', '.', '.', '.', '.', '.', '.', '.', '.'},
		               {'6', '.', '.', '.', '.', '.', '.', '.', '.'},
		               {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
		               {'8', '.', '.', '.', '.', '.', '.', '.', '.'},
		               {'9', '.', '.', '.', '.', '.', '.', '.', '.'}};
		assertTrue(sol.isValidSudoku(b1));
	}
}
