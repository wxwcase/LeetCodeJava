package medium.largestnumber;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import common.datastruct.IntegerSequenceComparator;

public class Solution {

  private final List<Integer> list = new LinkedList<>();
  private final IntegerSequenceComparator integerComparator = new IntegerSequenceComparator();
  private final StringBuffer buffer = new StringBuffer();
  
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
    // Use TreeSet with customized comparator

    // Base case:
    if (num.length == 0) {
      return "";
    } else if (num.length == 1) {
      return String.valueOf(num[0]);
    }
    
    int sum = 0;
    for (int i = 0; i < num.length; i++) {
      sum += num[i];
      list.add(num[i]);
    }
    if (sum == 0) {
      return "0";
    }

    Collections.sort(list, integerComparator);
    
    for (int i = 0; i < list.size(); i++) {
      System.out.print(" " + list.get(i));
      buffer.insert(0, list.get(i));
    }
    
    return buffer.toString();
  }
}