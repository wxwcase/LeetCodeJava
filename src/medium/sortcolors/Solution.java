package medium.sortcolors;

public class Solution {

  /**
   * Sort the array, which consists of 0, 1, 2.
   * @param A input array
   */
  public void sortColors(int[] A) {
    int start = 0;
    int end = A.length - 1;
    int ptr = 0;
    while (ptr <= end) {
      // if ptr -> 2, swap with end, end--
      if (A[ptr] == 2) {
        swap(A, ptr, end);
        end--;
      } else if (A[ptr] == 0) {
        // if ptr -> 0, swap with start, start++
        swap(A, ptr, start);
        start++;
        if (ptr < start) {
          ptr = start;
        }
      } else if (A[ptr] == 1) {
        ptr++;
      }
    }
  }
  
  /**
   * Swap elements in array.
   * @param array input
   * @param l left element
   * @param r right element
   */
  private void swap(int[] array, int l, int r) {
    int tmp = array[r];
    array[r] = array[l];
    array[l] = tmp;
  }
}
