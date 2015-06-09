package easy.isomorphic;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {

  /**
   * Find if the two strings are isomorphic.
   * @param s first string
   * @param t second string
   * @return true if they are isomorphic.
   */
  public boolean isIsomorphic(String s, String t) {

    if (s.length() == 0 && t.length() == 0) {
      return true;
    }
    
    HashMap<Character, Character> map = new HashMap<>();
    // mapped character set
    HashSet<Character> set = new HashSet<>();
    Character left;
    Character right;
    Character current;

    // assume two array has same length;
    for (int i = 0; i < s.length(); i++) {
      left = s.charAt(i);
      right = t.charAt(i); 
      current = map.get(left);
      if (current == null) {
        if (set.contains(right)) {
          return false;
        } else {
          map.put(left, right);
          set.add(right);
        }
      } else if (current != right) {
        return false;
      }
    }

    return true;
  }
}
