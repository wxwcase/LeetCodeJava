package medium.findminimuminroatedsortedarray;

import java.util.Arrays;

public class Solution {

  /**
   * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
   * find the minimum element.
   * No duplicate exists
   * O(n) solution
   * @param num rotated array
   * @return minimum element
   */
  public int findMin(int[] num) {
    for (int i = 1; i < num.length; i++) {
      if (num[i] < num[i - 1]) {
        return num[i];
      }
    }
    return 0;
  }
  
  /**
   * nlog(n) solution.
   * @param num input array
   * @return min value
   */
  public int findMin2(int[] num) {
    if (num.length < 1) {
      return 0;
    }
    
    Arrays.sort(num);
    return num[0];
  }
  
  /**
   * Log(n) implementation.
   * @param num input array
   * @return min value
   */
  public int findMin3(int[] num) {
    int start = 0;
    int end = num.length - 1;
    
    if (num[start] < num[end]) {
      return num[start];
    }
    
    while (end - start < 1) {
      int mid = (start + end) / 2;
      if (num[start] < num[mid]) {
        start = mid;
      } else {
        end = mid;
      }
    }
    
    return num[end];
  }
}
