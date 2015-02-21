package easy.validpalindrome;

public class Solution {

	/**
	 * Given a string, determine if it is a palindrome, 
	 * considering only alphanumeric characters and ignoring cases
	 * @param s input string
	 * @return true if the string is palindrome
	 */
	public boolean isPalindrome(String s) {
       if (s.length() == 0) {
    	   return true;
       } 
       String result = regularize(s);
       for (int i = 0; i < result.length() / 2; i++) {
    	   if (result.charAt(i) != result.charAt(result.length() - i - 1)) {
    		   return false;
    	   }
       }
       return true;
    }
	
	public String regularize(String s) {
		String result = "";
		result = s.replaceAll("[^A-Za-z0-9]", "");
		return result.toLowerCase();
	}
}
