package easy.compareversionnumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	/**
	 * Compare two version numbers version1 and version2
	 * If version1 ? version2 return 1, if version1 < version2 return -1, otherwise return 0.
	 * You may assume that the version strings are non-empty and contain only digits and the '.' character.
	 * e.g.: 0.1 < 1.1 < 1.2 < 13.37
	 * @param version1 version 1
	 * @param version2 version 2
	 * @return 1 If version1 > version2, -1 if version1 < version2, 0 otherwise.
	 */
	public int compareVersion(String version1, String version2) {
		int len1 = version1.length();
		int len2 = version2.length();
		List<String> list1 = new ArrayList<String>(Arrays.asList(version1.split("\\.")));
		List<String> list2 = new ArrayList<String>(Arrays.asList(version2.split("\\.")));
		int delta = Math.abs(list1.size() - list2.size());
		int max = list1.size() > list2.size() ? list1.size() : list2.size();
		if (len1 < len2) {
			for (int i = 0; i < delta; i++) {
				list1.add("0");
			}
		} else if (len1 > len2) {
			for (int i = 0; i < delta; i++) {
				list2.add("0");
			}
		}
		for (int i = 0; i < max; i++) {
			if (Integer.parseInt(list1.get(i)) > Integer.parseInt(list2.get(i))) {
				return 1;
			} else if (Integer.parseInt(list1.get(i)) < Integer.parseInt(list2.get(i))){
				return -1;
			}
		}
		return 0;
	}
}
