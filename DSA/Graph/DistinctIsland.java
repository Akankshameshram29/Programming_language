package Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class DistinctIsland {

    private void dfs(int row, int col, int[][] vis, int[][] grid, ArrayList<String> vec, int row0, int col0) {
        vis[row][col] = 1;
        // Storing relative position as a string
        vec.add((row - row0) + " " + (col - col0));

        int n = grid.length;
        int m = grid[0].length;

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, -1, 0, 1};

        for (int i = 0; i < 4; i++) {
            int newRow = row + delRow[i];
            int newCol = col + delCol[i];

            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m &&
                vis[newRow][newCol] == 0 && grid[newRow][newCol] == 1) {
                dfs(newRow, newCol, vis, grid, vec, row0, col0);
            }
        }
    }

    public int CountDistinctIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && grid[i][j] == 1) {
                    ArrayList<String> vec = new ArrayList<>();
                    dfs(i, j, vis, grid, vec, i, j);
                    // Converting the shape to a string and adding to the set
                    set.add(vec.toString());
                }
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        DistinctIsland solution = new DistinctIsland();

        // Test Case 1
        int[][] grid1 = {
            {1, 1, 0, 0, 0},
            {1, 1, 0, 0, 1},
            {0, 0, 0, 1, 1},
            {0, 1, 0, 0, 0},
            {1, 1, 0, 1, 1}
        };

        int result1 = solution.CountDistinctIsland(grid1);
        System.out.println("Number of distinct islands in Test Case 1: " + result1);

        // Test Case 2
        int[][] grid2 = {
            {1, 1, 0, 1},
            {1, 0, 0, 0},
            {0, 0, 1, 1},
            {1, 1, 0, 0}
        };

        int result2 = solution.CountDistinctIsland(grid2);
        System.out.println("Number of distinct islands in Test Case 2: " + result2);
    }
}
