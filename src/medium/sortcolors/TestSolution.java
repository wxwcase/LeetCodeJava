package medium.sortcolors;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  
  private Solution sol;

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
    int[] a1 = {1, 2, 0, 2, 0, 2, 1, 1, 1, 0, 0, 1, 0, 2};
    int[] r1 = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2};
    sol.sortColors(a1);
    for (int i = 0; i < a1.length; i++) {
      System.out.print(a1[i] + " ");
    }
    assertArrayEquals(r1, a1);
    
    int[] a2 = {2, 1, 1, 0, 2, 1, 0};
    int[] r2 = {0, 0, 1, 1, 1, 2, 2};
    sol.sortColors(a2);
    assertArrayEquals(r2, a2);
  }

}
