package medium.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

  /**
   * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
   * Find all unique triplets in the array which gives the sum of zero.
   * @param num input array
   * @return List Elements int output in a triplet (a,b,c) must be in non-descending order 
   *         and contains no duplicates.
   */
  public List<List<Integer>> threeSum(int[] num) {
    // Algorithm:
    // 1. Sort the array
    // 2. from i = 1 to n - 2:
    //    - find two numbers(j, k: j from i increasing, k from n - 2 decreasing)
    //      num[i:n-2] that sums to num[i]
    //    - if num[j] + num[k] < num[i], increase i, otherwise decrease k
    List<List<Integer>> result = new ArrayList<>();
    if (num.length < 3) {
      return result;
    }
    
    Arrays.sort(num);
    for (int i = 0; i < num.length - 2; i++) {
      List<Integer> item = new ArrayList<>();
      int sum2 = -num[i];
      int j = i + 1;
      int k = num.length - 1;
      while (j < k) {
        if (num[j] + num[k] == sum2) {
          item.add(num[i]);
          item.add(num[j]);
          item.add(num[k]);
          while (j < k && num[k - 1] == num[k]) {
            k--;
          }
          while (j < k && num[j + 1] == num[j]) {
            j++;
          }
          k--;
          j++;
          if (!result.contains(item)) {
            result.add(item);
            item = new ArrayList<>();
          }
        } 
        while (j < k && num[j] + num[k] < sum2) {
          j++;
        } 
        while (j < k && num[j] + num[k] > sum2) {
          k--;
        }
      }
      while (i < num.length - 2 && num[i] == num[i + 1]) {
        i++;
      }
    }
    return result;
  }
  
}
