package medium.uniquebinarysearchtrees;

public class Solution {

  /**
   * Given n, how many structurally unique BST's.
   * @param n number
   * @return number of different BST's
   */
  public int numTrees(int n) {
    if (n < 2) {
      return 1;
    } else {
      int sum = 0;
      for (int i = 1; i <= n; i++) {
        sum += numTrees(i - 1) * numTrees(n - i);
      }
      return sum;
    }
  }
}
