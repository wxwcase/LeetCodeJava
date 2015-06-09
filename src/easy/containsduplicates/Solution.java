package easy.containsduplicates;

import java.util.HashSet;

public class Solution {
  
  /**
   * Find if the given array contains duplicates.
   * @param nums input array
   * @return true if input array contains duplicates
   */
  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    boolean result = false;
    for (int num : nums) {
      if (!set.add(num)) {
        result = true;
      }
    }
    return result;
  }
}
