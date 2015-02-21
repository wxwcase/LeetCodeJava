package easy.validsudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	/**
	 * Determine if a Sudoku is valid
	 * @param board
	 * @return
	 */
	public boolean isValidSudoku(char[][] board) {
		// validate row
		for (int i = 0; i < board.length; i++) {
			if (!isValidUnit(board[i])) {
				return false;
			}
		}
		System.out.println("row valid");
		// validate column 
		char[] unit = null;
		for (int i = 0; i < board.length; i++) {
			unit = new char[board.length];
			for (int j = 0; j < board.length; j++) {
				unit[j] = board[j][i];
			}
			if (!isValidUnit(unit)) {
				return false;
			}
		}
		System.out.println("column valid");
		// validate unit
		for (int i = 0; i < board.length; i += 3) {
			for (int j = 0; j < board.length; j += 3) {
				unit = new char[9];
				int count = 0;
				for (int m = 0; m < 3; m++) {
					for (int n = 0; n < 3; n++) {
						unit[count] = board[i + m][j + n];
						count++;
					}
				}
				if (!isValidUnit(unit)) {
					return false;
				}
			}
		}
		System.out.println("Units valid");
		return true;
	}
	
	public boolean isValidUnit(char[] unit) {
		Set<Character> set = new HashSet<>();
		for (char i = '0'; i <= '9'; i++) {
			set.add(i);
		}
		for (int i = 0; i < unit.length; i++) {
			if (unit[i] != '.') {
				if (set.contains(unit[i])) {
					set.remove(unit[i]);
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
