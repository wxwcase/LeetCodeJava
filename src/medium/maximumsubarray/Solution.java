package medium.maximumsubarray;

public class Solution {

  /**
   * Find the contiguous subarray wihin an array which
   * has the largest sum.
   * @param A input array
   * @return maximum sum
   */
  public int maxSubArray(int[] A) {
    if (A.length == 0) {
      return 0;
    }
    
    int[] dp = new int[A.length];
    
    int maxSum = A[0];
    dp[0] = A[0];
    
    for (int i = 1; i < A.length; i++) {
      dp[i] = Math.max(dp[i - 1] + A[i], A[i]);
      maxSum = Math.max(dp[i], maxSum);
    }
    
    return maxSum;
  }
}
