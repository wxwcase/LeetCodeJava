package medium.palindromepartitioning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
  
  List<String> list;

  /**
   * Given a string s, partition s such that every substring of the partition is a palindrome.
   * @param s input string
   * @return palindrome list
   */
  public List<List<String>> partition(String s) {
    list = new LinkedList<>();
    return dfs(s, list);
  }
  
  public List<List<String>> dfs(String str, List<String> prevStr) {
    
    List<List<String>> result = new ArrayList<List<String>>();

    for (int i = 0; i < str.length(); i++) {
      List<String> set = new ArrayList<String>();
      if (isPalindrome(str.substring(0,i + 1))) {
        set.addAll(prevStr);
        set.add(str.substring(0,i + 1));
        if (i == str.length() - 1) {
          result.add(set);
        } else {
          result.addAll(dfs(str.substring(i + 1),set));
        }
      }
    }
    return result;
  }
  
  /**
   * Helper function to determine if a string is a palindrome.
   * @param s input string
   * @return true if the string is a palindrome
   */
  private boolean isPalindrome(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      sb.append(str.charAt(i));
    }
    return sb.toString().equals(str) ? true : false;
  }
}
