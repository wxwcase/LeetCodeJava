package medium.largestnumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
  
  private static final TreeMap<Character, Integer> MAP = new TreeMap<>();
  
  /**
   * Given a list of non negative integers, arrange them such that they form the
   * largest number.
   * @param num input integer array
   * @return the largest integer
   */
  public String largestNumber(int[] num) {
    // Algorithm
    // 1. Choose the one with first digit the largest
    //      - No conflict: choose the number and remove it and iterate
    //      - Conflicts: loop through the conflicts and keep the last digit and compare
    //      -            choose the one with the largest last digit and go to 1.
    // 2. Deal with the rest

    // Base case:
    if (num.length == 0) {
      return "";
    } else if (num.length == 1) {
      return String.valueOf(num[0]);
    }
    
    // Create storage
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < num.length; i++) {
      list.add(num[i]);
    }

    StringBuffer sb = new StringBuffer();
    preprocess(num);
    Map.Entry<Character, Integer> lastEntry = MAP.lastEntry();
    char currentChar;
    while (lastEntry != null) {
      currentChar = lastEntry.getKey();
      int count = MAP.get(currentChar);
      for (int i = 0; i < count; i++) {
        sb.append(currentChar);
      }
      MAP.remove(currentChar);
      lastEntry = MAP.lastEntry();
    }
    return sb.toString(); 
  }
  
  /**
   * Loading input array into the map.
   * @param num input array
   */
  private void preprocess(int[] num) {
    String content = "";
    for (int i = 0; i < num.length; i++) {
      content = String.valueOf(num[i]);
      for (int j = 0; j < content.length(); j++) {
        if (MAP.containsKey(content.charAt(j))) {
          int val = MAP.get(content.charAt(j));
          MAP.put(content.charAt(j), ++val);
        } else {
          MAP.put(content.charAt(j), 1);
        }
      }
    }
  }
}
