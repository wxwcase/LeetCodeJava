package easy.removeduplicatesfromsortedarray;

public class Solution {
	
	/**
	 * Given an sorted array, remove the duplicates in place such that each element
	 * appear only once and return the new length
	 * Do not allocate extra space for another array, do this inplace with constant memory
	 * @param A
	 * @return
	 */
	public int removeDuplicates(int[] A) {
		// Algorithm:
		// 1. loop through the array
		//		- if find duplicate, shift the elements on the right to left by one
		//		- keep counting how many elements deleted
		if (A == null) {
			return 0;
		} 
		int newLen = A.length;
		if (newLen < 2) {
			return newLen;
		}
		
		int i = 0, j = 1;
		while(j < A.length) {
			int count = 0;
			while (j < A.length && A[i] == A[j]) {
				j++;
				count++;
			}
			if (j < A.length) {
				A[i + 1] = A[j];
			}
			j++;
			i++;
			newLen -= count;
		}
		return newLen;
	}
}
