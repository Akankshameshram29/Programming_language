package DP;

public class NinjaTraining {
   private int Memoization(int day,int last, int[][] points,int[][]dp){
   if(day == 0){
      int maxi = 0;
      for(int task= 0;task<3;task++){
         if(task != last){
            maxi = Math.max(maxi,points[0][task]);
         }
      }
      return maxi;
   }
   if(dp[day][last] != -1){
      return dp[day][last];
   }
   int maxi =0;
   for(int task =0;task<3;task++){
      if(task != last){
         int point = points[day][task] + Memoization(day-1,task,points,dp);
         maxi = Math.max(maxi,point);
      }
   }
   return dp[day][last]=maxi;
   }
   
   public int NinjaTraining(int n,int [][] points){
      int [][] dp = new int[n][4];
      return Memoization(n-1, 3, points,dp);
   }

   
}