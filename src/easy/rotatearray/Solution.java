package easy.rotatearray;

public class Solution {

    /**
     * Rotate array to the right by k steps.
     * @param nums the array to be shifted
     * @param k steps to be rotated
     */
  public void rotate(int[] nums, int k) {
    int[] result = new int[nums.length];
    int newIndex;
    for (int i = 0; i < nums.length; i++) {
      newIndex = (i + k) % nums.length;
      result[newIndex] = nums[i];
    }
    for (int i = 0; i < nums.length; i++) {
      nums[i] = result[i];
    }
  }

  /**
   * Rotate array in place, use O(1) space.
   * @param nums array to be rotated
   * @param k steps to be rotated
   */
  public void rotateInPlace(int[] nums, int k) {
    for (int i = 0; i < k; i++) {
      rotateByOne(nums);
    }
  }
  
  private void rotateByOne(int[] nums) {
    int tmp = nums[0];
    for (int i = nums.length - 1; i > 0 ; i--) {
      nums[(i + 1) % nums.length] = nums[i];
    }
    nums[1] = tmp;
  }
}
