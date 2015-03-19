package medium.uniquepaths;

public class Solution {
  
  /**
   * A robot is located at the top-left corner of a m x n grid, The robot can only 
   * move either down or right at any point in time. The robot is trying to reach 
   * the bottom-right corner of the grid, How many possible unique paths are there?
   * @param m m rows
   * @param n n columns
   * @return unique paths
   */
  public int uniquePaths(int m, int n) {
    int[][] memory = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0) {
          memory[i][j] = 1;
        }
        if (j == 0) {
          memory[i][j] = 1;
        }
        memory[i][j] = -1;
      }
    }
    return helper(m, n, memory);
  }
  
  private int helper(int m, int n, int[][] memory) {

    if (m == 1 || n == 1) {
      return 1;
    }

    if (memory[m - 1][n - 1] != -1) {
      return memory[m - 1][n - 1];
    }
    
    memory[m - 1][n - 1] = helper(m - 1, n, memory) + helper(m, n - 1, memory);
    
    return memory[m - 1][n - 1];
  }
  
  /**
   * Solution 2.
   * @param m row
   * @param n column
   * @return unique paths
   */
  public int uniquePaths2(int m, int n) {
    Integer[][] map = new Integer[m][n];

    for (int i = 0; i < m;i++){
      map[i][0] = 1;
    }

    for (int j = 0;j < n; j++){
      map[0][j] = 1;
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        map[i][j] = map[i - 1][j] + map[i][j - 1];
      }
    }
    return map[m - 1][n - 1];
  }
}
