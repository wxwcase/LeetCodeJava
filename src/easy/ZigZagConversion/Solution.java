package easy.ZigZagConversion;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	/**
	 * e.g.: "PAYPALISHIRING" will be converted to "PAHNAPLSIIGYIR"
	 * @param s
	 * @param nRows
	 * @return
	 */
	public String convert(String s, int nRows) {
		if (s == "" || nRows == 1) {
			return s;
		}
		char[] carray = s.toCharArray();
		List<List<Character>> lists = new ArrayList<List<Character>>(nRows);
		for (int i = 0; i < nRows; i++) {
			lists.add(new ArrayList<Character>());
		}
		// List<Character>[] lists = (ArrayList<Character>[])new ArrayList[nRows];
		boolean down = true;
		int index = 0;
		lists.get(index).add(carray[0]);
		for (int i = 1; i < carray.length; i++) {
			if(down) {
				index++;
//				System.out.println("Down: " + carray[i]);
				lists.get(index).add(carray[i]);
				if(index == nRows - 1) {
					down = false;
					continue;
				}
			}
			if(!down) {
				index--;
//				System.out.println("Up: " + carray[i]);
				lists.get(index).add(carray[i]);
				if(index == 0) {
					down = true;
				}
			}
		}
		
		List<Character> resultList = new ArrayList<>();
		for (int i = 0; i < nRows; i++) {
//			System.out.println(lists.get(i));
			resultList.addAll(lists.get(i));
		}
		String result = "";
		for (Character c : resultList) {
			result += c;
		}
		return result;
	}
}
