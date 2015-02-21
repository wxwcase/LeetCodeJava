package easy.zigzagconversion;

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

	public String convert2(String s, int nRows) {
		if(s == "" || nRows == 1) {
			return s;
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < nRows; i++) {
			int diff = 2 * nRows - 2 - 2 * i;
			for (int j = i; j < s.length(); j += 2 * (nRows - 1)) {
				sb.append(s.substring(j, j + 1));
				if (i == 0 || i == nRows - 1) {
					continue;
				}
				if(j + diff < s.length()) {
					sb.append(s.substring(j + diff, j + diff + 1));
				}
			}
		}
		return sb.toString();
	}
	/*
	// A simple python solution:
	def convert(sef, s, n):
		// null case
		if n == 1:
			return s
		
		// create a list of empty strings
		res = ['' for i in range(n)]
		
		// initialize the sequence
		index = 0
		step = 1
		
		// add s[i] to the list using index
		for i in range(len(s)):
			res[index] += s[i]
			if index == n - 1:
				step = -1
			elif index == 0:
				step = 1
			index += step
		return ''.join(res)
	*/
}
