package DP;

import java.util.Arrays;

public class ClimbingStairs {
    public int memoization(int n,int []dp){         
        if(n==0 || n==1){
            return 1;
        }
       if(dp[n]!=-1){
            return dp[n];
        }
        int ans = memoization(n-1,dp) + memoization(n-2,dp);    
        return ans;
    }
    public int ClimbingStairs(int n){
        int []dp = new int[n+1];
        Arrays.fill(dp, -1);
        return memoization(n, dp);
    }

    public int tabulation(int n){
       int[] dp= new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
        
    }

    public int SpaceOptimization(int n){
        int prev = 1;
        int prev2 = 1;
        for(int i =2;i<n;i++){
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev2;
    }
}
