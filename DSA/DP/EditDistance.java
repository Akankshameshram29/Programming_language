package DP;

public class EditDistance {
    private int memoiozation(int i, int j, String s1, String s2,int [][]dp){
        if(i<0){
            return j+1;
        }
        if(j<0){
           return i+1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=0+memoiozation(i-1, j-1, s1, s2,dp);
        }
        else{
           return dp[i][j]=Math.min(1+memoiozation(i, j-1, s1, s2,dp),Math.min(1+memoiozation(i-1, j, s1, s2,dp),
           1+memoiozation(i-1, j-1, s1, s2,dp)));
        }
    }
    private int Tabulation(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int [][]dp = new int[n+1][m+1];
        for(int i =0;i<=n;i++){
            dp[i][0] = i;
        }
        for(int j =0;j<=m;j++){
            dp[0][j] = j;
        }
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 0+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.min(1+dp[i][j-1],Math.min(1+dp[i-1][j],1+dp[i-1][j-1]));
                }
            }
        }
        return dp[n][m];
    }
}
        