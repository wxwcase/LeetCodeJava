package easy.ExcelSheetColumnNumber;

public class Solution {

	/**
	 * Given a column title as appear in an Excel sheet, 
	 * return its corresponding column number. 
	 * @param s column title in string, such as A, B, Z, AB, AZ, ...
	 * @return column number corresponding to the column title
	 */
	public int titleToNumber(String s) {
		int result = 0;
		if (s.length() == 0) {
			return result;
		}
		if (s.length() == 1) {
			result = s.charAt(0) - 'A' + 1;
			return result;
		}
		if (s.length() > 1) {
			char[] carray = s.toCharArray();
			for (int i = 0; i < carray.length; i++) {
				if (i != carray.length - 1) {
					char c = s.charAt(i);
					result += (c - 'A' + 1) * (int)Math.pow(26, carray.length - i - 1);
				} else {
					result += s.charAt(carray.length - 1) - 'A' + 1;
				}
			}
		}
		return result;
	}
}
