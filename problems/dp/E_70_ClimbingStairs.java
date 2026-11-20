class Solution {

    //memoization
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return stairs(dp,n);
    }
    private static int stairs(int[] dp , int n){
        if(n<=2) return n;
        if(dp[n]!=0) return dp[n];
        dp[n] = stairs(dp,n-1) + stairs(dp,n-2);
        return dp[n];
    }
}

// 1. Recursion (Brute Force)
// class Solution {
//     public int climbStairs(int n) {
//         if (n <= 1) {
//             return 1;
//         }

//         return climbStairs(n - 1) + climbStairs(n - 2);
//     }
// }
// 3. Tabulation (Bottom-Up DP)

// class Solution {
//     public int climbStairs(int n) {

//         if (n <= 1) return 1;

//         int[] dp = new int[n + 1];

//         dp[0] = 1;
//         dp[1] = 1;

//         for (int i = 2; i <= n; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2];
//         }

//         return dp[n];
//     }
// }