package easy.happynumber;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestSolution {
  Solution sol;

  @Before
  public void setUp() throws Exception {
    sol = new Solution();
  }

  @After
  public void tearDown() throws Exception {
    sol = null;
  }

  @Test
  public void testIsHappy() {
    assertTrue(sol.isHappy(19));
    assertFalse(sol.isHappy(2));
  }
  
  @Ignore
  public void testSplitNumbers() {
    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    List<Integer> list2 = sol.splitNumber(123);
    assertTrue(list1.equals(list2));
  }

}
