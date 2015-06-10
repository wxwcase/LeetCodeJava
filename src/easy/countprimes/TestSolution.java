package easy.countprimes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  Solution sol;
  int n2 = 0;
  int n3 = 1;
  int n5 = 2;
  int n10 = 4;
  int n20 = 8;
  int n30 = 10;
  int n40 = 12;

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
    assertEquals(n2, sol.countPrimes(2));
    assertEquals(n3, sol.countPrimes(3));
    assertEquals(n5, sol.countPrimes(5));
    assertEquals(n10, sol.countPrimes(10));
    assertEquals(n20, sol.countPrimes(20));
    assertEquals(n30, sol.countPrimes(30));
    assertEquals(n40, sol.countPrimes(40));
  }

}
