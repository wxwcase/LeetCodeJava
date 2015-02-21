package easy.implementstrstr;

public class Solution {
	
	/**
	 * Implement strStr()
	 * @param haystack
	 * @param needle
	 * @return the index of the first occurrence of needle in haystack, or -1 if needle
	 *  is not part of haystack
	 */
	public int strStr(String haystack, String needle) {
		if (needle.length() > haystack.length()) {
			return -1;
		}
		if (haystack.equals("")) {
			if (needle.equals("")) {
				return 0;
			} else {
				return -1;
			}
		} else if (needle.equals("")) {
			return 0;
		}
		int firstOcc = -1;
		int countNeedle = 0;
		for (int i = 0; i < haystack.length() && countNeedle < needle.length(); i++) {
			char h = haystack.charAt(i);
			char n = needle.charAt(countNeedle);
			if (h != n) {
				i -= countNeedle;
				countNeedle = 0;
				firstOcc = -1;
				continue;
			} else if (haystack.length() - i < needle.length() - countNeedle) {
				// left is not enough in length
				return -1;
			} else {
				firstOcc = i;
				countNeedle++;
			}
		}
		if (countNeedle == needle.length() && firstOcc != -1) {
			return firstOcc - needle.length() + 1;
		} else {
			return -1;
		}
	}
}
