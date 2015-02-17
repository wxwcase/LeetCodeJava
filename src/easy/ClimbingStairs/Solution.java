package easy.ClimbingStairs;

import java.util.LinkedList;
import java.util.List;

public class Solution {

	private List<Integer> storage = new LinkedList<>();
	/**
	 * You are climbing a stair case. It takes n steps to reach to the top.
	 * - Each time you can either climb 1 or 2 steps. In how many distinct 
	 *   ways can you climb to the top?
	 * @param n
	 * @return
	 */
	public int climbStairs(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		}
		storage.add(1);
		storage.add(2);
		if (storage.size() == n) {
			return storage.get(n - 1);
		} else {
			int ptr = 2;
			while (ptr < n) {
				storage.add(storage.get(ptr - 1) + storage.get(ptr - 2));
				ptr++;
			}
			return storage.get(n - 1);
		}
	}
}
