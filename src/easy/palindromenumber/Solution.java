package easy.palindromenumber;

public class Solution {
	
	/**
	 * Do not use extra space
	 * @param x
	 * @return
	 */
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int xwidth = width(x);
		for (int i = 0; i < xwidth / 2; i++) {
			int right = numAtIndex(x, i);
			int left = numAtIndex(x, xwidth - i - 1);
//			System.out.println("Left: " + left + ": right: " + right);
			if (left != right) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Find out the 'length' of an integer
	 * @param x
	 * @return
	 */
	public int width(int x) {
		int count = 1;
		while(x >= 10) {
			count++;
			x /= 10;
		}
		return count;
	}
	
	public int numAtIndex(int num, int index) {
		num /= Math.pow(10, index);
		num %= 10;
		return num;
	}
}
