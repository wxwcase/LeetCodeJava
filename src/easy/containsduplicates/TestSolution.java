package easy.containsduplicates;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  Solution sol;
  int[] a1 = {};
  int[] a2 = {1};
  int[] a3 = {1, 2, 3};
  int[] a4 = {1, 2, 3, 2};
  

  @Before
  public void setUp() throws Exception {
    sol = new Solution();
  }

  @After
  public void tearDown() throws Exception {
    sol = null;
  }

  @Test
  public void testEmptyArray() {
    boolean result = sol.containsDuplicate(a1);
    assertFalse(result);
  }
  
  @Test
  public void testSingleElementArray() {
    boolean result = sol.containsDuplicate(a2);
    assertFalse(result);
  }

  @Test
  public void testNoDuplicateArray() {
    boolean result = sol.containsDuplicate(a3);
    assertFalse(result);
  }
  
  @Test
  public void testHasDuplicateArray() {
    boolean result = sol.containsDuplicate(a4);
    assertTrue(result);
  }
}
