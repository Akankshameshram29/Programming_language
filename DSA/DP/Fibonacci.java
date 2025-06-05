package DP;

import java.util.Arrays;

public class Fibonacci {
    public int memoization(int n,int [] dp){
        
        if (n <= 1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = memoization(n - 1, dp) + memoization(n - 2, dp);
    
        return dp[n];
    }
    public int Fibonacci(int n){
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return memoization(n, dp);
    }
    public int[] tabulation(int n) {
        int[] dp = new int[n + 1];
        if(n<=1){
            dp[0] = 0;
            dp[1] = 1;
        }
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp;
    }
    public int spaceOptimized(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

       int prev = 1;
       int prev2 = 0;
       for (int i = 2; i <= n; i++) {
           int curr = prev + prev2;
           prev2 = prev;
           prev = curr;
       }
        return prev;
    }
}
