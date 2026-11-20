//tabulation
// class Solution {
//     public int minCostClimbingStairs(int[] cost) {
//     int n = cost.length;
//     int[] dp = new int[n];
//     dp[0] = cost[0];
//     dp[1] = cost[1];
//     for(int i=2;i<cost.length;i++){
//         dp[i] =  cost[i] + Math.min(dp[i-1],dp[i-2]);
//     }
//     return Math.min(dp[n - 1], dp[n - 2]);

// }
// }

// recursion:
// class Solution {
//     public int minCostClimbingStairs(int[] cost) {
//         int n = cost.length;

//         return Math.min(
//             solve(cost, n - 1),
//             solve(cost, n - 2)
//         );
//     }
//     private static int solve(int[] cost, int i){
//         if(i==0) return cost[i];
//          if(i==1) return cost[i];
//         int step1 = solve(cost,i-1)+ cost[i];
//         int  step2 = solve(cost,i-2)+cost[i];
//         return Math.min(step1,step2);
//     }
// }

// memoization :
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(
                solve(cost, n - 1,dp),
                solve(cost, n - 2,dp)
        );
    }
    private static int solve(int[] cost, int i,int[] dp){
        if(i==0) return cost[0];
        if(i==1) return cost[1];
        if(dp[i] != -1) return dp[i];
        int step1 = solve(cost,i-1,dp)+ cost[i];
        int  step2 = solve(cost,i-2,dp)+cost[i];
        return dp[i] =  Math.min(step1,step2);
    }
}