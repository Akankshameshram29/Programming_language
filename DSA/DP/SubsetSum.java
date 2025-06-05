package DP;

//check if there is a subset whose sum is equal to k
public class SubsetSum {
    
    public boolean memoization(int index, int target, int[] arr, Boolean[][] dp) {
        if (target == 0) return true;
        if (index == 0) return arr[0] == target;

        if (dp[index][target] != null) return dp[index][target];

        boolean not_take = memoization(index - 1, target, arr, dp);
        boolean take = false;
        if (target >= arr[index]) {
            take = memoization(index - 1, target - arr[index], arr, dp);
        }

        return dp[index][target] = take || not_take;
    }

    public boolean isSubsetSum(int[] nums, int k) {
        int n = nums.length;
        Boolean[][] dp = new Boolean[n][k + 1];
        return memoization(n - 1, k, nums, dp);
    }

    public boolean Tabulation(int n, int k, int [] arr, boolean [][]dp){
          for(int i=0;i<n;i++){
            dp[i][0] = true;
        }
        if (arr[0] <= k) {
        dp[0][arr[0]] = true;
        }

        for(int index =1;index<n;index++){
            for(int target=1;target<=k;target++){
                boolean not_take = dp[index - 1][target];
                boolean take = false;
                if (target >= arr[index]) {
                     take = dp[index - 1][target-arr[index]];
                }
                dp[index][target] = take || not_take;
            }
        }
        return dp[n-1][k];
    }

    public boolean SpaceOptimization(int n, int k , int []arr){
        boolean [] prev = new boolean[k+1];
        boolean [] curr = new boolean[k+1];
       prev[0]=true;
       curr[0]=true;
       prev[arr[0]]=true;
       for(int index =1;index<n;index++){
            for(int target=1;target<=k;target++){
                boolean not_take = prev[target];
                boolean take = false;
                if (target >= arr[index]) {
                     take = prev[target-arr[index]];
                }
                curr[target] = take || not_take;
            }
            prev = curr;
        }
        return prev[k];
    }
}


