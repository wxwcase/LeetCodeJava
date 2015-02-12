package easy.StringToInteger;

public class Solution {

	/**
	 * Implement atoi to convert a string to an integer
	 * Border case:
	 * 	1. Empty string
	 *  2. Leading/trailing zeros
	 *  3. Invalid character in the middle of the string
	 *  4. Integer overflow
	 * @param str
	 * @return
	 */
	public int atoi(String str) {
		// Empty Case:
		StringBuffer buffer = new StringBuffer(str.trim());
		if (buffer.length() == 0) {
			return 0;
		}
		
		// Sign:
		String firstChar = buffer.substring(0, 1);
		String sign = firstChar; 
		int numIndex = 0;
		if (!sign.equals("-") && !sign.equals("+")) {
			sign = "";
		} else {
			firstChar = buffer.substring(1, 2);
			numIndex = 1;
		}
		
		// Remove leading zeros:
		while(firstChar.equals("0")) {
			buffer.deleteCharAt(numIndex);
			if (buffer.length() != 0) {
				firstChar = buffer.substring(numIndex, numIndex + 1);
			} else {
				return 0;
			}
		}

		
		// Base(without sign):
		String base = sign.equals("") ? buffer.toString() : buffer.substring(1);
		long result = 0L;
		for (int i = 0; i < base.length(); i++) {
			int c = base.charAt(i) - '0';
			if (c < 0 || c > 9) {
				// invalid case
				break;
			} else {
				// valid case
				result *= 10;
				result += c;
				if (!sign.equals("-") && result > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				} else if(sign.equals("-") && result - Integer.MAX_VALUE > 1) {
					return Integer.MIN_VALUE;
				}
			}
		}
		
		// Result resemble:
		if (sign.equals("-")) {
			// negative case
			if (-result < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			} else {
				return (int)(-result);
			}
		} else {
			// positive case
			if (result > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			} else {
				return (int)result;
			}
		}
	}
}
