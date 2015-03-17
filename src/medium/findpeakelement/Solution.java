package medium.findpeakelement;

public class Solution {

  /**
   * Find a peak element in an array, which num[i] != num[i+1]
   * @param num input array
   * @return index of peak element
   */
  public int findPeakElement(int[] num) {
    int low = 0;
    int high = num.length - 1;
    int mid = (low + high) / 2;
    while (low < high) {
      if (num[mid] > num[mid + 1]) {
        high = mid;
      } else {
        low = mid;
      }
      mid = (low + high) / 2;
    }
    return low;
  }
}
