package easy.countprimes;

public class Solution {

  /**
   * Count the number of prime numbers less than a
   * non-negative number, n.
   * @param n 
   * @return
   */
  public int countPrimes(int n) {
    int count = 0;
    for (int i = 1; i < n; i++) {
      if (isPrime(i)) {
        count++;
      }
    }
//    System.out.println();
    return count;
  }
  
  private boolean isPrime(int m) {
    // assume m > 0
    if (m <= 1) {
      return false;
    } else if (m == 2 || m == 3) {
      return true;
    } else if (m % 2 == 0 || m % 3 == 0) {
      return false;
    }
    for (int i = 3; i * i <= m; i += 2) {
      if (m % i == 0) {
        return false;
      }
    }
//    System.out.println(m + " ");
    return true;
  }
  
  // The Sieve of Eratosthenes uses an extra O(n) memory and its runtime complexity is O(n log log n).

  /**
   * Pseudocode:
   * Input: an integer n > 1
   * Let A be an array of boolean values, indexed by integers
   * 2 to n, initially all set to true.
   * for i = 2, 3, 4, ..., not exceeding Math.sqrt(n):
   *   if A[i] is true:
   *     for j = i*i, i*i + i, i*i + 2i, i*i + 3i, ..., not exceeding n:
   *       A[j] = false;
   * Output: all i such that A[i] is true;
   * @param m
   * @return
   */
  private int countPrime_Sieve_of_Eratosthenes(int m) {
    boolean[] isPrime = new boolean[m];
    for (int i = 2; i < m; i++) {
      isPrime[i] = true;
    }
    for (int i = 2; i * i < m; i++) {
      if (!isPrime[i]) continue;
      // mark off multiply of i as not prime
      for (int j = i * i; j < m; j += i) {
        isPrime[j] = false;
      }
    }
    int count = 0;
    for (int i = 2; i < m; i++) {
      if (isPrime[i]) count++;
    }
    return count;
  }
}
