package easy.containsduplicateii;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

  /**
   * Given an array of integers and an integer k, find out whether there there are 
   * two distinct indices i and j in the array such that nums[i] = nums[j] and the 
   * difference between i and j is at most k.
   * @param nums input array
   * @param k maximum distance between duplicates
   * @return if there exists such indices
   */
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    // idea: linear search each element except the last k elements
    //       for each element, test the next k - 1 elements
    if (nums.length <= k) {
      // reduce to solve: search for duplicates
      Arrays.sort(nums);
      for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == nums[i + 1]) {
          return true;
        }
      }
      return false;
    } else {
      for (int i = 0; i < nums.length - k; i++) {
        for (int j = i + 1; j < i + k + 1 ; j++) {
          if (nums[i] == nums[j]) {
            return true;
          }
        }
      }
    }
    return false;
  }
}
