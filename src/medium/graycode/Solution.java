package medium.graycode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  /**
   * Given a non-negative integer n representing the total number of bits in the code,
   * print the sequence of gray code. A gray code sequence must begin with 0.
   * @param n input number
   * @return list of gray code
   */
  public List<Integer> grayCode(int n) {
    List<Integer> result = new ArrayList<>();
    process(result, n);
    return result;
  }
  
  /**
   * Generate gray code sequence(T(n)) based on previous one (T(n - 1)).
   * @param list T(n - 1)
   */
  private void process(List<Integer> list, int n) {

    if (n == 0) {
      list.clear();
      list.add(0);
    } else if (n == 1) {
      // empty list, for n = 1;
      list.clear();
      list.add(0);
      list.add(1);
    } else {
      // for n > 1
      List<Integer> tmp = new ArrayList<>();
      process(list, n - 1);
      for (Integer i : list) {
        tmp.add(0, i | (1 << (n - 1)));
      }
      list.addAll(tmp);
    }
  }
}
