package easy.lengthoflastword;

public class Solution {
	
	public int lengthOfLastWord(String s) {
		s = s.trim();
		if (s.equals("")) {
			return 0;
		}
		int indexOfLastSpace = s.lastIndexOf(' ');
		if (indexOfLastSpace == -1) {
			return s.length();
		} else {
			return s.length() - indexOfLastSpace - 1;
		}
	}
}
