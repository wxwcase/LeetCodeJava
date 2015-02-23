package medium.repeateddnasequences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
  
  private static final Map<Character, Integer> MAP = new HashMap<>();

  static {
    MAP.put('A', 0);
    MAP.put('C', 1);
    MAP.put('G', 2);
    MAP.put('T', 3);
  }

  private static final int SIZE_POW_9 = (int)Math.pow(MAP.size(), 9);

  /**
   * Find all the 10-letter-long sequences(substrings) that occur more than once in a 
   * DNA molecule.
   * @param str input DNA sequence 
   * @return list of repeated sequence
   */
  public List<String> findRepeatedDnaSequences(String str) {
    Set<String> result = new HashSet<>();
    Set<Integer> hashes = new HashSet<>();
    for (int i = 0, hashVal = 0; i < str.length(); i++) {
      if (i > 9) {
        hashVal -= SIZE_POW_9 * MAP.get(str.charAt(i - 10));
      } 
      hashVal = MAP.size() * hashVal + MAP.get(str.charAt(i));
      if (i > 8 && !hashes.add(hashVal)) {
        result.add(str.substring(i - 9, i + 1));
      }
    }
    return new ArrayList<>(result);
  }
}
