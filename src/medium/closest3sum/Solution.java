package medium.closest3sum;

import java.util.Arrays;

public class Solution {

  /**
   * @param num
   * @param target
   * @return
   */
  public int threeSumClosest(int[] num, int target) {
    // 1. Sort the array
    // 2. 
    if (num.length < 3) {
      return 0;
    }
    Arrays.sort(num);
    int min = Math.abs(num[0] + num[1] + num[2] - target);
    int result = num[0] + num[1] + num[2];
    for (int i = 0; i < num.length - 2; i++) {
      int j = i + 1;
      int k = num.length - 1;
      while (j < k) {
        if (Math.abs(num[j] + num[k] + num[i] - target) < min) {
          min = Math.abs(num[i] + num[j] + num[k] - target);
          result = num[i] + num[j] + num[k];
        }
        while (j < k && num[j] == num[j + 1]) {
          j++;
        }
        while (j < k && num[k] == num[k - 1]) {
          k--;
        }
        if (num[i] + num[j] + num[k] < target) {
          j++;
        } else {
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
