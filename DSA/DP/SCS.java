package DP;
public class SCS{
    private String f(String s1, String s2,int n , int m, int[][]dp){
       for(int i =0;i<=n;i++){
        dp[i][0]=0;
       }
       for(int j =0;j<=m;j++){
        dp[0][j] =0; 
       }
       for(int i =1;i<=n;i++){
        for(int j =1;j<=m;j++){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                dp[i][j] = 1+dp[i-1][j-1];
            }
            else{
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
       }

        StringBuilder ans = new StringBuilder();
       int i = n; int j=m;
       while(i>0 && j>0){
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            ans.append(s1.charAt(i - 1));
            i--;
            j--;
        }
        else if(dp[i-1][j]>dp[i][j-1]){
            ans.append(s1.charAt(i - 1));
            i--;
        }
        else{
          ans.append(s2.charAt(j - 1));
          j--;
        }
       }
       while(i>0){
        ans.append(s1.charAt(i - 1));
        i--;
       }
       while(j>0){
        ans.append(s2.charAt(j - 1));
        j--;
       }
        return ans.reverse().toString();
    }
}