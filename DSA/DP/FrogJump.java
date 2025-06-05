package DP;
import java.util.Arrays;

class FrogJump {
    private int memoization(int index,int [] stones,int []dp){
        if (index == 0){
            return 0;
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int left =memoization(index-1,stones,dp) +Math.abs(stones[index]-stones[index-1]);
        int right = Integer.MAX_VALUE;
        if(index > 1){
            right = memoization(index-2,stones,dp) +Math.abs(stones[index]-stones[index-2]);
        }
        return dp[index] = Math.min(left,right);
    }
   public int main(int[] stones) {
        int n = stones.length;
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
       return memoization(n-1,stones,dp);
   }
   public int tabulation(int[] stones) {
        int n = stones.length;
        int [] dp = new int[n+1];
        dp[0] = 0;
        for(int i =0;i<n;i++){
            int fs =dp[i-1] + Math.abs(stones[i]-stones[i-1]);
            int ss = Integer.MAX_VALUE; 
            if(i > 1){
                ss = dp[i-2] + Math.abs(stones[i]-stones[i-2]);
            
            } 
            dp[i] = Math.min(fs,ss);
        }
        return dp[n-1];
    }


    public int spaceOptimized(int[] stones) {
        int n = stones.length;
        int prev1 = 0;
        int prev2 = 0;
        for(int i =0;i<n;i++){
            int fs =prev1 + Math.abs(stones[i]-stones[i-1]);
            int ss = Integer.MAX_VALUE; 
            if(i > 1){
                ss = prev2 + Math.abs(stones[i]-stones[i-2]);
            
            } 
            int curr = Math.min(fs,ss);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}