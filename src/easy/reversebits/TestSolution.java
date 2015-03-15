package easy.reversebits;

import static org.junit.Assert.*;

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
    int a1 = 13; // 1101
    int a2 = 1;
    long r1 = 11;
    long r2 = 2147483648L;
    assertEquals(r1, sol.reverseBits(a1));
    assertEquals(r2, sol.reverseBits(a2));
  }

}
