package easy.mergesortedarray;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
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
		int A[] = new int[7];
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		A[3] = 4;
		int[] B = {5, 6, 7};
		int[] R1 = {1, 2, 3, 4, 5, 6, 7};
		sol.merge(A, 4, B, 3);
		assertArrayEquals(R1, A);
	}
	
	@Test
	public void test2() {
		int A[] = new int[4];
		A[0] = 5;
		int B[] = {2, 4, 8};
		int R[] = {2, 4, 5, 8};
		sol.merge(A, 1, B, 3);
		assertArrayEquals(R, A);
	}

	@Test
	public void testEmpty() {
		int A[] = {};
		int B[] = {};
		int R1[] = {};
		sol.merge(A, 0, B, 0);
		assertArrayEquals(R1, A);
	}
}
