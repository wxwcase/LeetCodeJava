package medium.singlenumberii;

public class Solution {

  /**
   * Given an array of integers, every element appears three times except for one
   * Fint that one
   * @param A
   * @return
   */
  public int singleNumber(int[] A) {
    int[] result = new int[32];
    for (int i = 0; i < 32; i++) {
      int tmp = 0;
      for (int j = 0; j < A.length; j++) {
        tmp += (A[j] & (1 << i)) >> i;
      }
      result[i] = tmp % 3;
    }
    
    int finalRes = 0;
    for (int i = 0; i < 32; i++) {
      finalRes |= result[i] << i;
    }
    
    return finalRes;
  }
}
