package medium.largestnumber;

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
  public void test() {
    int[] a1 = {3, 30, 34, 5, 9};
    String s1 = "9534330";
    assertEquals(s1, sol.largestNumber(a1));
  }
  
  @Test
  public void testEmpty() {
    int[] a1 = {};
    String s1 = "";
    assertEquals(s1, sol.largestNumber(a1));
  }
  
  @Test
  public void testOneItemArray() {
    int[] a1 = { 2048 };
    String s1 = "2048";
    assertEquals(s1, sol.largestNumber(a1));
  }

}
