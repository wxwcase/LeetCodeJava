package easy.happynumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
  Set<Integer> set = new HashSet<>();
  
  /**
   * Description: A happy number is a number defined by the following process: 
   *   Starting with any positive integer, replace the number by the sum of the 
   *   squares of its digits, and repeat the process until the number equals 1 
   *   (where it will stay), or it loops endlessly in a cycle which does not 
   *   include 1. Those numbers for which this process ends in 1 are happy numbers.
   * @param n the input
   * @return true if n is "happy number"
   */
  public boolean isHappy(int n) {
    if (n <= 0) {
      return false;
    }
    List<Integer> list = splitNumber(n);
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i) * list.get(i);
    }
    
    if (sum == 1) {
      return true;
    } else if (!set.add(sum)) {
      return false;
    } else {
      return isHappy(sum);
    }
  }
  
  /**
   * Split a positive integer into a list of digits.
   * @param n input integer
   * @return a list of digits
   */
  public List<Integer> splitNumber(int n) {
    
    List<Integer> list = new ArrayList<>();
    
    while (n >= 10) {
      list.add(n % 10);
      n /= 10;
    }
    list.add(n);
    return list;
  }
}
