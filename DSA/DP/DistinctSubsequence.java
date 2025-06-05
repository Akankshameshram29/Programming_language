package DP;

class DistinctSubsequence {
private int memoization(int i , int j,String s1,String s2, int [][]dp){
    if(j<0){
        return 1;
    }
    if(i<0){
        return 0;
    }
    if(dp[i][j] != -1){
        return dp[i][j];
    }
    if(s1.charAt(i) == s2.charAt(j)){
       dp[i][j]= memoization(i-1, j-1,s1,s2, dp) + memoization(i-1, j, s1, s2, dp);
    }
    else{
       dp[i][j]= memoization(i-1, j, s1, s2, dp);
    }
    return dp[i][j];
}
private int Tabulation(String s1, String s2, int[][]dp){
   int n = s1.length();
   int m = s2.length();
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1; // Empty string s2 can be formed by deleting all characters
        }
        for(int j=0;j<=m;j++){
            dp[0][j] = 0; // Non-empty s2 cannot be formed from an empty s1
        }

        // Build the table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][m];
}
    
}