package DP;



public class RodCutting{
    private int memoization(int index,int n,int [] prices,int [][]dp){
         if(index == 0){
            dp[0][index]=n * prices[0];
        }
        if(dp[index][n] != -1){
            return dp[index][n];
        }
        int not_take = 0 + memoization(index-1, n, prices,dp);
        int rod_length = index-1;
        int take = Integer.MIN_VALUE;
        if(rod_length <= n){
            take = prices[index] + memoization(index, rod_length, prices, dp);
        }
        return dp[index][n] = Math.max(take,not_take);
    }
    private int tabulation(int []prices,int n, int[][]dp){
      for(int N=0;N<=n;N++){
       dp[0][N] = N * prices[0];
      }
      for(int index = 1;index<n;index++){
        for(int N =0;N<=n;N++){
        int not_take = 0 + dp[index-1][n];
        int rod_length = index-1;
        int take = Integer.MIN_VALUE;
        if(rod_length <= N){
            take = prices[index] + dp[index][N-rod_length];
        }
        dp[index][N] = Math.max(take,not_take);
        }
        
      }
      return dp[n-1][n];
    }
    private int SpaceOptimization(int []prices,int n, int[][]dp){
        int [] prev = new int[n+1];
         int [] curr = new int[n+1];
      for(int N=0;N<=n;N++){
     prev[N] = N * prices[0];
      }
      for(int index = 1;index<n;index++){
        for(int N =0;N<=n;N++){
        int not_take = 0 + prev[N];
        int rod_length = index-1;
        int take = Integer.MIN_VALUE;
        if(rod_length <= N){
            take = prices[index] + curr[N-rod_length];
        }
        curr[N]= Math.max(not_take, take);
        } 
        prev = curr;
        }
        return prev[n];
    }
      
    


}
