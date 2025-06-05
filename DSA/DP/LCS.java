package DP;


public class LCS{
 private int memoization(int index1, int index2, String s1, String s2, int [][]dp){
    if(index1 < 0 || index2 <0){
        return 0;
    }
    if(dp[index1][index2] != -1){
        return dp[index1][index2];
    }
    if (s1.charAt(index1) == s2.charAt(index2))
     {
       return dp[index1][index2] = 1 + memoization(index1-1, index2-1, s1, s2, dp);
    }
    else{
       return dp[index1][index2] = Math.max(memoization(index1-1, index2, s1, s2, dp),memoization(index1, index2-1, s1, s2, dp));
    }
  }
  private int tabulation(int n , int m,String s1, String s2, int [][]dp){
    for (int j = 0;j<=m;j++){
        dp[0][j] = 0;
    }
    for(int i =0;i<= n;i++){
        dp[i][0] = 0;
    }
    for(int i =1;i<=n;i++){
        for(int j = 1;j<=m;j++){
            if (s1.charAt(i-1) == s2.charAt(j-1)){
              dp[i][j] = 1 + dp[i-1][j-1];
           }
           else{
             dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
           }
        }
    }
    return dp[n][m];
  }
}