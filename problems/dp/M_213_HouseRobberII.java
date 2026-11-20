//tabulation:
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int picklast = solve(nums,n-1,1);
        int notpicklast = solve(nums,n-2,0);
        return Math.max(picklast, notpicklast);
    }
    private static int solve(int[] nums, int i, int start){
        int n = i- start +1;
        int[] dp = new int[nums.length-1];
        dp[0] = nums[start];
        if (n == 1) return dp[0];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        for (int j = 2; j < n; j++) {
            int pick = nums[start + j] + dp[j - 2];
            int notPick = dp[j - 1];
            dp[j] = Math.max(pick, notPick);
        }
        return dp[n - 1];
    }
}
// recursion:

// class Solution {

//     public int rob(int[] nums) {

//         int n = nums.length;

//         if (n == 1) return nums[0];

//         int case1 = solve(nums, n - 2, 0);
//         int case2 = solve(nums, n - 1, 1);

//         return Math.max(case1, case2);
//     }

//     private int solve(int[] nums, int i, int start) {

//         if (i < start) return 0;

//         int pick = nums[i] + solve(nums, i - 2, start);

//         int notPick = solve(nums, i - 1, start);

//         return Math.max(pick, notPick);
//     }
// }

// memoization:
// class Solution {
//     public int rob(int[] nums) {
//         int n = nums.length;
//         int[] dp1 = new int[n];
//         int[] dp2 = new int[n];
//         if(n==1) return nums[0];
//         Arrays.fill(dp1,-1);
//         Arrays.fill(dp2,-1);
//         int picklast = solve(nums,n-1,1,dp1);
//         int notpicklast = solve(nums,n-2,0,dp2);
//         return Math.max(picklast, notpicklast);
//     }
//     private static int solve(int[] nums, int i, int start, int[] dp){
//         if(i<start) return 0;
//         if(i== start) return nums[i];
//         if(dp[i]!=-1) return dp[i];
//         int pick = nums[i]+ solve(nums,i-2,start,dp);
//         int notpick = solve(nums,i-1,start,dp);
//         return dp[i] = Math.max(pick,notpick);
//     }
// }