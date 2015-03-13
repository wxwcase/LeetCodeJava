package medium.palindromepartitioning;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

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
    String s1 = "a";
    String s2 = "ab";
    List<List<String>> r = new LinkedList<>();
    List<String> m = new LinkedList<>();
    m.add("a");
    m.add("b");
    r.add(m);
    assertEquals(r, sol.partition(s2));
    List<List<String>> list = sol.partition(s1);
    for (List<String> l : list) {
      for (String s : l) {
        assertEquals(s1, s);
      }
    }
  }

}
