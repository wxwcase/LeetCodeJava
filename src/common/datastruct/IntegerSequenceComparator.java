package common.datastruct;

import java.util.Comparator;

public class IntegerSequenceComparator implements Comparator<Integer> {
  
  /**
   * Compare integer sequence combination.
   * @param i1 first input
   * @param i2 second input
   * @return return 1 if i1 is larger(digit-wise) than i2
   */
  public int compare(Integer i1, Integer i2) {
    String s1 = String.valueOf(i1);
    String s2 = String.valueOf(i2);
    return (s1 + s2).compareTo(s2 + s1);
  }
}
