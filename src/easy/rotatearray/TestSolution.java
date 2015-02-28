package easy.rotatearray;

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
  public void test() {
    int[] a1 = {1, 2, 3, 4, 5, 6, 7};
    int[] r1 = {5, 6, 7, 1, 2, 3, 4};
    int k1 = 3;
    sol.rotateInPlace(a1, k1);
    assertArrayEquals(r1, a1);
  }

}
