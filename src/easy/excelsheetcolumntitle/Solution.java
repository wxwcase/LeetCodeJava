package easy.excelsheetcolumntitle;

public class Solution {
	
	/**
	 * Given an positive integer, return its corresponding column
	 * title as appear in an Excel sheet.
	 * @param n number to be converted to title string
	 * @return title string
	 */
	public String convertToTitle(int n) {
		String result = "";
		if(n < 1) {
			return result;
		} else if (n < 27) {
			char c = (char)(n - 1 + 'A');
			result += c;
			return result;
		} else {
			int last = n % 26;
			int remainder = n / 26;
			char c;
			if(last == 0) {
				c = 'Z';
				remainder--;
			} else {
				c = (char)(last - 1 + 'A');
			}
			result = c + result;
			while(remainder > 26) {
				last = remainder % 26;
				if (last == 0) {
					c = 'Z';
					remainder--;
				} else {
					c = (char)(last - 1 + 'A');
				}
				result = c + result;
				remainder /= 26;
			}
			c = (char)(remainder - 1 + 'A');
			result = c + result;
			return result;
		}
	}
}
