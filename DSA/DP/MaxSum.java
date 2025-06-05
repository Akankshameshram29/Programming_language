package DP;

import java.util.Arrays;

//maximum sum non adjacent elements
public class MaxSum {
    public int memoization(int index, int []nums, int []dp){
        if(index==0){
            return nums[index];
        }
        if(index<0){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int pick = nums[index] + memoization(index-2, nums, dp);
        int non_pick = 0 + memoization(index-1, nums, dp);

        return dp[index] = Math.max(pick, non_pick);    
    }

    public int MaxSum(int[] nums){
       int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return memoization(n - 1, nums, dp);
    }

    public int tabulation(int []nums,int[]dp){
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
       
      dp[0] = nums[0];
      dp[1] = Math.max(nums[0], nums[1]);

       for(int i =2;i<n;i++){
        int pick = nums[i] + dp[i-2];
        int non_pick = 0 + dp[i-2];
         dp[i] = Math.max(pick,non_pick);
       }
       return dp[n-1];
    }

    public int spaceOptimization(int []nums, int []dp){
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int prev = nums[0];
        int prev2 = 0;
        for(int i =1;i<nums.length;i++){
            int take = nums[i];
            if(i>1){
                take += prev2;
            }
           int non_take = 0 + prev;
           int curr = Math.max(take, non_take);
           prev2 = prev;
           prev = curr;
          
        }
        return prev;
    }
}