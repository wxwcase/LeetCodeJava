package medium.integer2roman;

public class Solution {
  
  /**
   * Given an integer, convert it to a roman numeral.
   * @param num integer in range of 1 to 3999
   * @return Roman numeral
   */
  public String intToRoman(int num) {
    String[] M = {"", "M", "MM", "MMM"};
    String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
  }
}
