package DP;
public class BuyAndsell3{
    private int Memoization(int []prices,int index, int buy,int cap,int[][][]dp){
        if(cap == 0|| index == prices.length){
            return 0;
        }
        
        int profit = 0;
        if(buy==1){
           profit = Math.max(-prices[index]+Memoization(prices,index+1,0,cap,dp),0+Memoization(prices, index+1,1,cap,dp));
        }
        else{
            profit = Math.max(prices[index]+Memoization(prices,index+1,1,cap-1,dp),0+Memoization(prices, index+1,0, cap, dp));
        
        }
        return dp[index][buy][cap];
    }

    
}