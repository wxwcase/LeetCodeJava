package easy.pascalstriangleII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	/**
	 * Given an index k, return the kth row of the Pascal's triangle
	 * For example, given k = 3, return [1, 3, 3, 1]
	 * Solution: 
	 * 		for row n, compute (n-1) choose (1...n)
	 * 		(N choose K + 1) = (N choose K) * (N - K) / (K + 1)
	 * @param rowIndex
	 * @return
	 */
	public List<Long> getRow(int rowIndex) {
        List<Long> list = new ArrayList<>();
        long one = 1l;
        list.add(one);
        if (rowIndex == 0) {
            return list;
        }
		for (int i = 1; i < rowIndex; i++) {
			list.add(chooseFrom(rowIndex, i));
		}
		list.add(one);
		return list;
    }
    
    public long chooseFrom(long n, long m) {
        if (m == 0) {
            return 1;
        } else {
            return chooseFrom(n, m - 1) * (n - m + 1) / m;
        }
    }
}
