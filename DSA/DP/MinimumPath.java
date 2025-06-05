package DP;

public class MinimumPath {
    public int memoization(int i , int j,int[][]grid, int[][]dp){
        if(i==0 && j==0){
            return grid[0][0];
        }
        if(i<0 || j<0){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int up = grid[i][j] + memoization(i-1, j, grid, dp);
        int left = grid[i][j] + memoization(i, j-1, grid, dp);
       
        return dp[i][j]= Math.min(up,left);
    }
    public int MinimumPathSum(int [][] grid){
        int n = grid.length;
        int m = grid[0].length;

        int [][] dp = new int[n][m];
        return memoization(n-1, m-1, grid, dp);
    }
}
