package easy.pascalstrianlge;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	/**
	 * Pascal numbers
	 * @param numRows
	 * @return
	 */
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (numRows == 0) {
			return result;
		}
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);
		for (int i = 0; i < numRows - 1; i++) {
			result.add(generateRowFromLastRow(firstRow));
			firstRow = generateRowFromLastRow(firstRow);
		}
		return result;
	}
	
	public List<Integer> generateRowFromLastRow(List<Integer> lastRow) {
		int lastRowLength = lastRow.size();
		List<Integer> result = new ArrayList<>(lastRowLength + 1);
		result.add(1);
		if (lastRowLength > 1) {
			for (int i = 1; i < lastRowLength; i++) {
				result.add(lastRow.get(i - 1) + lastRow.get(i));
			}
		}
		result.add(1);
		return result;
	}
}
