package medium.maximumproductsubarray;

public class Solution {

  /**
   * Find the contiguous subarray within an array.
   * @param nums input array
   * @return maximum product of subarray
   */
  public int maxProduct(int[] nums) {
    // dynamic programming
    if (nums == null || nums.length == 0) {
      return 0;
    }
    
    int maxLocal = nums[0];
    int minLocal = nums[0];
    int global = nums[0];
    
    for (int i = 0; i < nums.length; i++) {
      int tmp = maxLocal;
      maxLocal = Math.max(Math.max(nums[i], nums[i] * maxLocal), nums[i] * minLocal);
      minLocal = Math.min(Math.min(nums[i], nums[i] * tmp), nums[i] * minLocal);
      global = Math.max(global, maxLocal);
    }
    return global;
  }
}
