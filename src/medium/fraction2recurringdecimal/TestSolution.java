package medium.fraction2recurringdecimal;

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
  public void testRepeating() {
    int n1 = 2;
    int d1 = 3;
    String r1 = "0.(6)";
    
    int n2 = 5;
    int d2 = 3;
    String r2 = "1.(6)";
    
    int n3 = 5;
    int d3 = 6;
    String r3 = "0.8(3)";
    assertEquals(r1, sol.fractionToDecimal(n1, d1));
    assertEquals(r2, sol.fractionToDecimal(n2, d2));
    assertEquals(r3, sol.fractionToDecimal(n3, d3));
  }

  @Test
  public void testZeroNumerator() {
    int n1 = 0;
    int d1 = 2;
    String r1 = "0";
    assertEquals(r1, sol.fractionToDecimal(n1, d1));
  }
  
  @Test
  public void testZeroDenominator() {
    int n1 = 2;
    int d1 = 0;
    String r1 = "";
    assertEquals(r1, sol.fractionToDecimal(n1, d1));
  }
  
  @Test
  public void testNonRepeating() {
    int n1 = 1;
    int d1 = 2;
    String r1 = "0.5";
    
    int n2 = 2;
    int d2 = 10;
    String r2 = "0.2";
    
    int n3 = 1;
    int d3 = 99;
    String r3 = "0.(01)";

    assertEquals(r1, sol.fractionToDecimal(n1, d1));
    assertEquals(r2, sol.fractionToDecimal(n2, d2));
    assertEquals(r3, sol.fractionToDecimal(n3, d3));
  }
  
  @Test
  public void testMoreThanOneBeforeDot() {
    int n1 = 65;
    int d1 = 6;
    String r1 = "10.8(3)";
    assertEquals(r1, sol.fractionToDecimal(n1, d1));
  }
}
