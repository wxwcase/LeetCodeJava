package easy.numberof1bits;

public class Solution {

  /**
   * Write a function that takes an unsigned integer and returns the 
   * number of '1' bits it has.
   * @param n input integer
   * @return number of bits
   */
  public int hammingWeight(int n) {
    int count = 0;
    while (n > 0) {
      if ((n & 1) == 1) {
        count++;
      }
      n >>>= 1;
    }
    return count;
  }
}
