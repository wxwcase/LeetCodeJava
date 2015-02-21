package info.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HasGlobalTimeout {
  public static String log;
	
  @Rule
  public Timeout globalTimeout = new Timeout(3000); // 3 seconds max per method
	
  @Test
  public void testInfiniteLoop1() {
	log += "ran1";
	for(;;) {

	}
  }

  @Test 
  public void testInfiniteLoop2() {
    log += "ran2";
    for(;;) {

    }
  }
}
