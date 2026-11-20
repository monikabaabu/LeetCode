//tabulation:
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        int[] dp = new int[n];
        dp[0]=nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++){
            int pick = nums[i] + dp[i-2];
            int notpick = dp[i-1];
            dp[i] = Math.max(pick,notpick);
        }
        return dp[n-1];
    }

}

// recursion:
// class Solution {
//     public int rob(int[] nums) {
//         return solve(nums.length-1,nums);
//     }
//     private static int solve(int n, int[] nums){
//         if(n<0) return 0;
//         if(n==0) return nums[0];
//         int pick = nums[n] + solve(n-2,nums);
//         int notpick = solve(n-1, nums);
//         return Math.max(pick,notpick);
//     }
// }

//memoization:

// class Solution {
//     public int rob(int[] nums) {
//         int[] dp = new int[nums.length];
//         Arrays.fill(dp,-1);
//         return solve(nums.length-1,nums,dp);
//     }
//     private static int solve(int n, int[] nums,int[] dp){
//         if(n<0) return 0;
//         if(n==0) return nums[0];
//         if(dp[n]!= -1) return dp[n];
//         int pick = nums[n] + solve(n-2,nums,dp);
//         int notpick = solve(n-1, nums,dp);
//         return dp[n] = Math.max(pick,notpick);
//     }
// }