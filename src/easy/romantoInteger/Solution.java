package easy.romantoInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	/**
	 * Symbols: I(1), V(5), X(10), L(50), C(100), D(500), M(1000)
	 * Rules to avoid four characters repeated in succession:
	 * 	a. When a symbol appears after a larger symbol it is added
	 * 	b. If the symbol appears before a larger symbol it is subtracted
	 * 	c. Don't use the same symbol more than three times in a row
	 * 	1. Place V and X to make 4 units(IV), 9(IX)
	 * 	2. X can be placed before L and C to make 40(XL) or 90(XC)
	 * 	3. C can be placed before D and M to make 400(CD) and 900(CM)
	 * @param s
	 * @return
	 */
	public int romanToInt(String s) {
		Map<Character, Integer> map = makeDic();
		if (s.equals("")) {
			return 0;
		} else if (s.length() < 2) {
			return map.get(s.charAt(0));
		}
		Character prev = null; 
		Character current = null; 
		int result = 0; 
		for (int i = 1; i < s.length(); i++) {
			prev = s.charAt(i - 1);
			current = s.charAt(i);
			if (map.get(prev) >= map.get(current)) {
				result += map.get(prev);
			} else {
				result -= map.get(prev);
			}
		}
		result += map.get(current);
		return result;
	}
	
	private Map<Character, Integer> makeDic() {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		return map;
	}
}
