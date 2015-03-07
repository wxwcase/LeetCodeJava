package medium.fraction2recurringdecimal;

import java.util.HashMap;

public class Solution {

  /**
   * Given two integers representing numerator and denominator, return 
   * the fraction in string format.
   * If the fraction part is repeating, enclose the repeating part in
   * parentheses.
   * @param numerator numerator
   * @param denominator denominator
   * @return the String representation of numerator / denominator
   */
  public String fractionToDecimal(int numerator, int denominator) {
    if (numerator == 0) {
      return "0";
    } else if (denominator == 0) {
      return "";
    }

    StringBuilder result = new StringBuilder();
    
    // + or -:
    result.append(((numerator > 0) ^ (denominator > 0)) ? '-' : "");
    long num = Math.abs((long)numerator); // use long to prevent overflow
    long den = Math.abs((long)denominator);
    
    // integral part:
    result.append(num / den);
    num %= den;
    if (num == 0) {
      return result.toString();
    }

    // fractional part:
    result.append(".");
    HashMap<Long, Integer> map = new HashMap<>();
    map.put(num, result.length());
    while (num != 0) {
      num *= 10;
      result.append(num / den);
      num %= den;
      if (map.containsKey(num)) {
        int start = map.get(num);
        result.insert(start, "(");
        result.append(")");
        break;
      } else {
        map.put(num, result.length());
      }
    }
    return result.toString();
  }
}
