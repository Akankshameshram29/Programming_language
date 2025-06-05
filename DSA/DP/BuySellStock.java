package DP;
public class BuySellStock{
  private int Memoization(int index, int buy,int[]prices,int [][]dp){
    if(index == prices.length){
        return 0;
    }
    if(dp[index][buy] != -1){
        return dp[index][buy];
    }
    int profit = 0;
    if(buy==1){
        profit = Math.max(-prices[index] + Memoization(index+1,0,prices,dp), 0+Memoization(index+1,1, prices, dp));
    }
    else{
        profit = Math.max(prices[index]+Memoization(index+1,1,prices,dp),0+Memoization(index+1,0, prices, dp));
    }
    return dp[index][buy]=profit;
  }
  private int Tabulation(int []prices){
    
        int n = prices.length;
        int[][] dp = new int[n + 1][2]; // dp[index][buy] => max profit from index onwards, in buy state

        // Base cases: when index == n (after last day), profit is 0
        dp[n][0] = 0;
        dp[n][1] = 0;

        for (int index = n - 1; index >= 0; index--) {
            for (int buy = 0; buy <= 1; buy++) {
                int profit;
                if (buy == 1) {
                    profit = Math.max(-prices[index] + dp[index + 1][0], dp[index + 1][1]);
                } else {
                    profit = Math.max(prices[index] + dp[index + 1][1], dp[index + 1][0]);
                }
                dp[index][buy] = profit;
            }
        }

        return dp[0][1]; // Start at day 0 with ability to buy
    }
    private int SpaceOptimization(int []prices){
        int n = prices.length;
    
         int [] ahead = new int [2];
         int [] curr = new int [2];

        // Base cases: when index == n (after last day), profit is 0
        ahead[0]=0;
        ahead[1]=0;

        for (int index = n - 1; index >= 0; index--) {
            for (int buy = 0; buy <= 1; buy++) {
                int profit;
                if (buy == 1) {
                    profit = Math.max(-prices[index] + ahead[0], ahead[1]);
                } else {
                    profit = Math.max(prices[index] + ahead[1], ahead[0]);
                }
                curr[buy] = profit;
            }
            ahead = curr;
        }

        return ahead[1];
    }
}

  
