package easy.RemoveElement;

public class Solution {
	
	/**
	 * Given an array and a value, remove all instances of that value in place and return the
	 * new length.
	 * @param A
	 * @param elem
	 * @return
	 */
	public int removeElement(int[] A, int elem) {
		if (A.length == 0) {
			return 0;
		}
		int lastIndex = A.length - 1;
		int tmp = 0;
		for (int i = 0; i < lastIndex + 1; i++) {
			if (A[i] == elem) {
				while (A[lastIndex] == elem && lastIndex > i) {
					lastIndex--;
				}
				// swap with the last;
				tmp = A[lastIndex];
				A[lastIndex] = A[i];
				A[i] = tmp;
				lastIndex--;
			}
		}
		return lastIndex + 1;
	}
}
