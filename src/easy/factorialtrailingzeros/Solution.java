package easy.factorialtrailingzeros;

public class Solution {
	// find 5s
	/**
	 * Given an integer n, return the number of trailing zeros in n!.
	 * Time should be in O(logn)
	 * @param n
	 * @return
	 */
	public int trailingZeroes(int n) {
		// return n/5 + n/25 +n/125 + ...
		return n < 5 ? 0 : n/5 + trailingZeroes(n/5);
	}
}