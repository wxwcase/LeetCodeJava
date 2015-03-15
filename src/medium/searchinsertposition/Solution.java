package medium.searchinsertposition;

public class Solution {

  /**
   * Given a sorted array and a target, return the index if 
   * the target is found. If not, return the index where it would be
   * inserted.
   * @param A input array
   * @param target target 
   * @return index
   */
  public int searchInsert(int[] A, int target) {
    // based on binary search
    
    return binaryImproved(A, target, 0, A.length);
  }
  
  private int binaryImproved(int[] A, int target, int begin, int end) {
    if (begin < end) {
      int center = (begin + end) / 2;
      if (target > A[center]) {
        return binaryImproved(A, target, center + 1, end);
      } else if (target < A[center]) {
        return binaryImproved(A, target, begin, center);
      } else {
        return center;
      }
    } else {
      return begin;
    }
  }
}
