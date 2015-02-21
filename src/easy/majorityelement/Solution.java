package easy.majorityelement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	/**
	 * Given an array of size n, find the majority element. 
	 * The majority element is the element that appears more than Ln/2⌋ times.
	 * You may assume that the array is non-empty and the majority element always exist in the array.
	 * @param num array of number
	 * @return the majority number
	 */
	public int majorityElement(int[] num){
		int result = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < num.length; i++) {
			if(map.containsKey(num[i])) {
				int number = map.get(num[i]);
				map.put(num[i], ++number);
			} else {
				map.put(num[i], 1);
			}
		}
		int maxCount = 0;
		for(int key : map.keySet()) {
			if(map.get(key) > maxCount) {
				result = key;
				maxCount = map.get(key);
			}
		}
		return result;
	}
}
