package random;

public class Fibonacci {

  /**
   * DP approach.
   * Time: O(N), Space: O(1)
   * @param n the nth fib number
   * @return the nth fib number
   */
  public int fib1(int n) {
    if (n < 1) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else if (n == 2) {
      return 1;
    }

    int pre = 1; // index: 1
    int cur = 1; // index: 2
    
    for (int i = 0; i < n - 1; i++) {
      int next = cur + pre;
      pre = cur;
      cur = next;
    }
    
    return cur;
  }
}
