package medium.integer2roman;

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
    String s1 = "XII";
    int a1 = 12;
    assertEquals(s1, sol.intToRoman(a1));
    
    String s2 = "XXIX";
    int a2 = 29;
    assertEquals(s2, sol.intToRoman(a2));
  }

}
