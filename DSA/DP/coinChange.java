package DP;
public class coinChange {
    private int memoization(int index,int target,int []Coins, int[][] dp) {
        if(index == 0) {
              return (target % Coins[0] == 0) ?1:0;
        }
        if(dp[index][target] != -1) {
            return dp[index][target];
        }
        int not_take = memoization(index - 1, target, Coins, dp);
        int take = 0;
        if(Coins[index] <= target) {
            take = memoization(index, target - Coins[index], Coins, dp);
        }
        return dp[index][target] = take + not_take;
    }
    public int coinChange(int[] Coins, int target) {
        int n = Coins.length;
        int[][] dp = new int[n][target + 1];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= target; j++) {
                dp[i][j] = -1;
            }
        }
        return memoization(n - 1, target, Coins, dp);
    }
    private int tabulation(int n, int[] Coins, int target,int [][]dp) {
      for(int i =0;i<target;i++) {
          dp[0][i] = (target % Coins[0] == 0) ? 1 : 0;
      }
      for(int index = 1; index < n; index++) {
          for(int t=0;t<= target; t++) {
              int not_take = dp[index - 1][t];
              int take = 0;
              if(Coins[index] <= t) {
                  take = dp[index][t - Coins[index]];
              }
              dp[index][t] = take + not_take;
          }
      }
      return dp[n - 1][target];
    }

    
}



