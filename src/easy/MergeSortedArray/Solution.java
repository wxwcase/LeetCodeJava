package easy.MergeSortedArray;

public class Solution {
	
	/**
	 * Given two sorted integer arrays A and B, merge B into A as sone
	 * sorted array, You may assume that A has enough space (size that 
	 * is greater or equal to m + n) to hold additional elements from B.
	 *  The number of elements initialized in A and B are m and n respectively.
	 * @param A
	 * @param m
	 * @param B
	 * @param n
	 */
	public void merge(int A[], int m, int B[], int n) {
		if (m != 0 && n != 0) {
			int[] r = new int[m + n];
			int aptr = 0;
			int bptr = 0;
			int rptr = 0;
			while (aptr < m && bptr < n) {
				if (A[aptr] < B[bptr]) {
					r[rptr++] = A[aptr++];
				} else {
					r[rptr++] = B[bptr++];
				}
			}
			if (aptr == m) {
				while (bptr < n) {
					r[rptr++] = B[bptr++];
				}
			}
			if (bptr == n) {
				while (aptr < m) {
					r[rptr++] = A[aptr++];
				}
			}
			for (int i = 0; i < m + n; i++) {
				A[i] = r[i];
			}
		} else if (m == 0) {
			for (int i = 0; i < n; i++) {
				A[i] = B[i];
			}
		}
	}
}
