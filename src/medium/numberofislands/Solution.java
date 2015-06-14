package medium.numberofislands;

public class Solution {

  /**
   * Given a grid map of '1's(island) and '0's(water), count the number of
   * islands. Islands is surrounded by water.
   * @param grid grid map
   * @return number of islands
   */
  public int numIslands(char[][] grid) {
    int result = 1;
    int row = grid.length;
    int column = grid[0].length;
    
    int[][] islands = new int[row + 1][column + 1];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        islands[i][j] = 0;
      }
    }
    
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        // if it belongs to an island and has not been found
        if (grid[i][j] == 1 && islands[i + 1][j + 1] == 0) {
          // look around in islands:
          // if around has island # of 0, set result++ as its new number
          if (islands[i][j - 1] == 0
              && islands[i - 1][j] == 0
              && islands[i + 1][j] == 0
              && islands[i][j + 1] == 0) {
            islands[i + 1][j + 1] = result++;
          } else if (islands[i][j - 1] != 0) {
            islands[i + 1][j + 1] = islands[i][j - 1];
          } else if (islands[i][j + 1] != 0) {
            islands[i + 1][j + 1] = islands[i][j + 1];
          } else if (islands[i - 1][j] != 0) {
            islands[i + 1][j + 1] = islands[i - 1][j];
          } else {
            islands[i + 1][j + 1] = islands[i + 1][j];
          }
        }
      }
    }
    return result;
  }
  
  public int solution1(char[][] grid) {
    if (grid==null || grid.length==0 || grid[0].length==0) return 0;
    int count = 0;
 
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == '1') {
          count++;
          dfs1(grid, i, j);
        }
      }
    }
    return count;
  }
  private void dfs1(char[][] grid, int i, int j) {
  //validity checking
    if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1) {
        return;
    }
 
    //if current cell is water or visited
    if(grid[i][j] != '1') {
      return;
    }
 
    //set visited cell to '0'
    grid[i][j] = '0';
 
    //merge all adjacent land
    dfs1(grid, i-1, j);
    dfs1(grid, i+1, j);
    dfs1(grid, i, j-1);
    dfs1(grid, i, j+1);
  }
  
  public int solution2(char[][] grid) {
    if (grid.length == 0 || grid[0].length == 0 || grid == null) {
      return 0;
    }
    int count = 0;
    int rows = grid.length;
    int columns = grid[0].length;
    boolean[][] visited = new boolean[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        visited[i][j] = false;
      }
    }

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (grid[i][j] == '1' && !visited[i][j]) {
          count++;
          dfs2(grid, i, j, visited);
        }
      }
    }
    return count;
  }
  private void dfs2(char[][] grid, int i, int j, boolean[][] visited) {
    if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
      return;
    }
    if (grid[i][j] == '0' || visited[i][j]) {
      return;
    }
    visited[i][j] = true;
    dfs2(grid, i, j - 1, visited);
    dfs2(grid, i, j + 1, visited);
    dfs2(grid, i - 1, j, visited);
    dfs2(grid, i + 1, j, visited);
  }
}
