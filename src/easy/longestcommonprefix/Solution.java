package easy.longestcommonprefix;

import java.util.Arrays;

public class Solution {
	
	/**
	 * Write a function to find the longest common prefix string 
	 * amongest an array of strings
	 * @param strs
	 * @return
	 */
	public String longestCommonPrefix(String[] strs) {
		// empty input
		if (strs.length == 0) {
			return "";
		} else if (strs.length == 1) {
			return strs[0];
		}

		int end = 0;
		// Get longest length from the array
		int minLength = strs[0].length();
		for (int i = 1; i < strs.length; i++) {
			if (strs[i].length() < minLength) {
				minLength = strs[i].length();
			}
		}
		if (minLength == 0) {
			return "";
		}
		
		// Use first string to subtract everyone else and get int array
		Boolean[] result = new Boolean[minLength];
		for (int i = 0; i < minLength; i++) {
			char index = strs[0].charAt(i);
			result[i] = index == strs[1].charAt(i);
			for (int j = 2; j < strs.length; j++) {
				result[i] = (index == strs[j].charAt(i)) && result[i]; 
			}
		}
		for (int i = 0; i < result.length; i++) {
			if (result[i] == false) {
				end = i;
				break;
			} else if (i == result.length - 1 && result[i] == true) {
				end = result.length;
			}
		}
		return strs[0].substring(0, end);
	}
}
