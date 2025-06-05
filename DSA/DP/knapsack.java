package DP;

public class knapsack {
    private int Memoization(int index, int W, int []wt,int[] val,int [][]dp){
       if(index == 0){
        if(wt[0] <= W){
            return val[0];
        }
        else{
            return 0;
        }
       }
       if(dp[index][W] != -1){
        return dp[index][W];
       }

       int not_take= 0 + Memoization(index-1,W,wt,val,dp);
       int take = Integer.MIN_VALUE;
       if(wt[index] <=W){
        take = val[index] + Memoization(index-1,W-wt[index],wt,val,dp);
       }
       return dp[index][W]= Math.max(take,not_take);
    }
    private int tabulation(int n,int maxweight, int[]wt, int []val, int [][]dp){
        for (int W = wt[0];W <=maxweight;W++){
            dp[0][W] = val[0];
        }
        for(int index = 1;index<n;index++){
            for(int W=0;W<=maxweight;W++){
                int not_take= 0 + dp[index-1][W];
                int take = Integer.MIN_VALUE;
                if(wt[index] <=W){
                 take = val[index] + dp[index-1][W-wt[index]];
                }
               dp[index][W] = Math.max(take,not_take);
            }
        }
        return dp[n-1][maxweight];
    }
    private int SpaceOptimization(int n,int maxweight, int[]wt, int []val, int [][]dp){
        int [] prev = new int[maxweight+1];
        int [] curr = new int[maxweight+1];
        for (int W = wt[0];W <=maxweight;W++){
            prev[W] = val[0];
        }
        for(int index = 1;index<n;index++){
            for(int W=0;W<=maxweight;W++){
                int not_take= 0 + prev[W];
                int take = Integer.MIN_VALUE;
                if(wt[index] <=W){
                 take = val[index] + prev[W-wt[index]];
                }
               curr[W] = Math.max(take,not_take);
            }
            prev = curr;

        }
        return prev[maxweight];
    }

    public static void main(String[] args) {
        // Example inputs
        int[] wt = {1, 3, 4, 5};
        int[] val = {10, 40, 50, 70};
        int maxWeight = 8;
        int n = wt.length;

        // Creating an object of knapsack class
        knapsack ks = new knapsack();

        // ---------- Memoization ----------
        int[][] dpMemo = new int[n][maxWeight + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= maxWeight; j++) {
                dpMemo[i][j] = -1;
            }
        }
        int maxValueMemo = ks.Memoization(n - 1, maxWeight, wt, val, dpMemo);
        System.out.println("Maximum value using Memoization: " + maxValueMemo);

        // ---------- Tabulation ----------
        int[][] dpTab = new int[n][maxWeight + 1];
        int maxValueTab = ks.tabulation(n, maxWeight, wt, val, dpTab);
        System.out.println("Maximum value using Tabulation: " + maxValueTab);

        // ---------- Space Optimization ----------
        int maxValueSpaceOpt = ks.SpaceOptimization(n, maxWeight, wt, val, null);
        System.out.println("Maximum value using Space Optimization: " + maxValueSpaceOpt);
    }
}

