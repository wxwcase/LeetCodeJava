package medium.bitwiseandofnumbersrange;

public class Solution {

  /**
   * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the 
   * bitwise AND of all numbers in this range, inclusive.
   * @param m left index
   * @param n right index
   * @return [5, 7] will return 4.
   */
  public int rangeBitwiseAnd(int m, int n) {
    if (m == n) {
      return m;
    }
    int zeros = (int) Math.log(m - n) + 1;
    m = m >> zeros;
    n = n >> zeros;
    return rangeBitwiseAnd(m, n) << zeros;
  }
}
