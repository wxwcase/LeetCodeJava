package easy.numberof1bits;

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
    int a1 = 0;
    int a2 = 11;
    int a3 = 15;
    
    int r1 = 0;
    int r2 = 3;
    int r3 = 4;
    assertEquals(r1, sol.hammingWeight(a1));
    assertEquals(r2, sol.hammingWeight(a2));
    assertEquals(r3, sol.hammingWeight(a3));
  }
  
  @Test
  public void myFailedTest() {
//    int a1 = 2147483647;
//    int r1 = 1;
//    assertEquals(r1, sol.hammingWeight(a1));
  }

}
