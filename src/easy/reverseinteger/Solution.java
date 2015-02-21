package easy.reverseinteger;

public class Solution {
	
	/**
	 * Reverse integer: 123->321, -123->-321
	 * e.g.: 100010
	 * @param x
	 * @return return 0 when overflow
	 */
	public int reverse(int x) {
		String sign = "";
		long result = x;
		if (result == 0) {
			return 0;
		} else if (result < 0) {
			sign = "-";
			result = Math.abs(result);
		}
		
		StringBuffer buffer = new StringBuffer(String.valueOf(result));
		buffer = buffer.reverse();
		while(buffer.charAt(0) == '0') {
			buffer.deleteCharAt(0);
		}
		result = Long.parseLong(buffer.toString());
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			return 0;
		} else {
			return sign.equals("") ? (int) result : (int)(-result);
		}
	}
}
