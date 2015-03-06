package medium.singlenumberii;

public class Solution {

  /**
   * Given an array of integers, every element appears three times except for one.
   * Find that single one
   * @param A input array
   * @return the element not appears three times
   */
  public int singleNumber(int[] A) {
    int[] res = new int[32];
    for (int i = 0; i < 32; i++) {
      int tmp = 0;
      for (int j = 0; j < A.length; j++) {
        tmp += (res[i] & 1 << i) >> i;
      }
      res[i] = tmp % 3;
    }
    
    int finalRes = 0;
    for (int i = 0; i < 32; i++) {
      finalRes |= res[i] << i;
    }
    
    return finalRes;
  }
}
