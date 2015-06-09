package easy.isomorphic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {
  Solution sol;
  String s1 = "egg";
  String t1 = "add";
  
  String s2 = "foo";
  String t2 = "bar";
  
  String s3 = "paper";
  String t3 = "title";
  
  String s4 = "acdfaa";
  String t4 = "bknmbb";
  
  String s5 = "ab";
  String t5 = "aa";
  
  @Before
  public void setUp() throws Exception {
    sol = new Solution();
  }

  @After
  public void tearDown() throws Exception {
    sol = null;
  }

  @Test
  public void testIsIsomorphic() {
    assertTrue(sol.isIsomorphic(s1, t1));
    assertTrue(sol.isIsomorphic(s3, t3));
    assertTrue(sol.isIsomorphic(s4, t4));
  }
  
  @Test
  public void testIsNotIsomorphic() {
    assertFalse(sol.isIsomorphic(s2, t2));
    assertFalse(sol.isIsomorphic(s5, t5));
  }

}
