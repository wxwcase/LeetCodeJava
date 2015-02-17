package easy.AddBinary;

public class Solution {
	
	/**
	 * Given two binary strings, return their sum(also a binary string) 
	 * For example, a = "11", b = "1", return "100"
	 * @param a
	 * @param b
	 * @return
	 */
	public String addBinary(String a, String b) {
		if (a == null || b == null) {
			return a == null ? b : a;
		}
		if (a.equals("")) {
			return b;
		} else if (b.equals("")) {
			return a;
		} else {
			StringBuilder sb = new StringBuilder();
			int minSize = Math.min(a.length(), b.length());
			int currIndex = a.length() > b.length() ? a.length() - 1 : b.length() - 1;
			boolean mark = false;
			for (int i = 0; i < minSize; i++) {
				currIndex--;
				char aptr = a.charAt(a.length() - i - 1);
				char bptr = b.charAt(b.length() - i - 1);
				char rptr ;
				if (mark) {
					if (aptr == '0' && bptr == '0') {
						rptr = '1';
						mark = false;
					} else {
						rptr = (aptr == '1' && bptr == '1') ? '1' : '0';
					}
				} else {
					if (aptr == '1' && bptr == '1') {
						mark = true;
						rptr = '0';
					} else {
						rptr = (aptr == '1') ? aptr : bptr;
					}
				}
				sb.insert(0, rptr);
			}
			if (a.length() > b.length()) {
				while(currIndex >= 0) {
					if (mark) {
						if (a.charAt(currIndex) == '1') {
							sb.insert(0, '0');
						} else {
							sb.insert(0, '1');
							mark = false;
						}
					} else {
						sb.insert(0, a.charAt(currIndex));
					}
					currIndex--;
				}
			} else {
				while(currIndex >= 0) {
					if (mark) {
						if (b.charAt(currIndex) == '1') {
							sb.insert(0, '0');
						} else {
							sb.insert(0, '1');
							mark = false;
						}
					} else {
						sb.insert(0, b.charAt(currIndex));
					}
					currIndex--;
				}
			}
			if (mark) {
				sb.insert(0, '1');
			}
			return sb.toString();
		}
	}
}
