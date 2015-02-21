package easy.plusone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	/**
	 * Given a non-negative number represented as an array of digits, plus 
	 * one to the number. The digits are stored such that the most significant
	 * digit is at the head of the list.
	 * @param digits
	 * @return
	 */
	public int[] plusOne(int[] digits) {
		boolean done = false;
        if (digits.length == 0) {
			int[] a = new int[1];
			a[0] = 1;
			return a;
		} else {
			int count = digits.length - 1;
			while (count > 0) {
				if (digits[count] == 9) {
					digits[count--] = 0;
					continue;
				} else {
					digits[count] += 1;
					done = true;
					break;
				}
			}
			if (done) {
			    return digits;
			} else {
    			if (digits[count] == 9) {
				    digits[count] = 0;
    				return addFirst(digits, 1);
			    } else {
    			    digits[count] += 1;
				    return digits;
    			}
			}
		}
	}
	
	private int[] addFirst(int[] list, int x) {
		int[] newList = new int[list.length + 1];
		for (int i = 0; i < newList.length; i++) {
			if (i == 0) {
				newList[i] = x;
			} else {
				newList[i] = list[i - 1];
			}
		}
		return newList;
	}
}
