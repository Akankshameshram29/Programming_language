package DP;
//Maximum Falling path sum from any index in first row to any index in last row



public class FallingPath {
    
    
    public int memoization(int i, int j, int [][]grid,int [][]dp){
      if(i==0){
        return grid[0][j];
      }
      if(j<0 || j>= grid[0].length){
        return (int)-1e9;
      }
      if(dp[i][j] != -1){
        return dp[i][j];
      }
      int s = grid[i][j] + memoization(i-1, j, grid, dp);
      int ld = j>0 ? grid[i][j] + memoization(i-1, j-1, grid, dp):(int)-1e9;
      int rd = j<grid[0].length-1?grid[i][j] + memoization(i-1, j+1, grid, dp):(int)-1e9;
      
      return dp[i][j] = Math.max(s, Math.max(ld, rd));
    }

    public int Tabulation(int i, int j, int [][]grid, int [][]dp){
        for (j =0;j<grid[0].length-1;j++){
         dp[0][j] = grid[0][j];
        }
        for(i=1;i<grid.length-1;i++){
            for(j=0;j<grid[0].length-1;j++){
                int s = grid[i][j] + memoization(i-1, j, grid, dp);
                int ld = j>0 ? grid[i][j] + memoization(i-1, j-1, grid, dp):(int)-1e9;
                int rd = j<grid[0].length-1?grid[i][j] + memoization(i-1, j+1, grid, dp):(int)-1e9;

                dp[i][j] = Math.max(s, Math.max(ld, rd));
            }
        }
        return dp[i][j];
    }

    public int SpaceOptimization(int i, int j, int [][]grid, int [][]dp){
        int [] prev = new int[grid.length];
        for (j = 0; j < grid[0].length; j++) {
            prev[j] = grid[0][j];
        }
        
        for(i=1;i<grid.length;i++){
            int [] curr = new int[grid.length];
            for(j=0;j<grid[0].length;j++){
                int u = grid[i][j] + prev[j];
                int ld = grid[i][j] + prev[j-1];
                int rd = grid[i][j] + prev[j+1];

                curr[i] = Math.max(u, Math.max(ld, rd));
                prev = curr;
            }
        }
        return prev[0];
    }

    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [][]dp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j] = -1;
            }
        }
        int maxi = (int)-1e9;
        for (int j = 0; j < m; j++) {
            maxi = Math.max(maxi, memoization(n - 1, j, grid, dp));
        }
       return maxi;
    }
        
    
}