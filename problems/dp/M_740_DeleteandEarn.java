//memoization
class Solution {
    public int deleteAndEarn(int[] nums) {

        int max = 0;

        for (int num : nums) {
            max = Math.max(max, num);
        }

        int[] points = new int[max + 1];

        for (int num : nums) {
            points[num] += num;
        }

        int[] dp = new int[max + 1];
        Arrays.fill(dp, -1);

        return solve(max, points, dp);
    }

    private int solve(int i, int[] points, int[] dp) {

        if (i < 0) return 0;

        if (dp[i] != -1) return dp[i];

        int pick = points[i] + solve(i - 2, points, dp);

        int notPick = solve(i - 1, points, dp);

        return dp[i] = Math.max(pick, notPick);
    }
}

// recursion:

// class Solution {
//     public int deleteAndEarn(int[] nums) {

//         int max = 0;

//         for (int num : nums) {
//             max = Math.max(max, num);
//         }

//         int[] points = new int[max + 1];

//         for (int num : nums) {
//             points[num] += num;
//         }

//         return solve(max, points);
//     }

//     private int solve(int i, int[] points) {

//         if (i < 0) return 0;

//         int pick = points[i] + solve(i - 2, points);

//         int notPick = solve(i - 1, points);

//         return Math.max(pick, notPick);
//     }
// }

// tabulation:

// class Solution {
//     public int deleteAndEarn(int[] nums) {

//         int max = 0;

//         for (int num : nums) {
//             max = Math.max(max, num);
//         }

//         int[] points = new int[max + 1];

//         for (int num : nums) {
//             points[num] += num;
//         }

//         int[] dp = new int[max + 1];

//         dp[0] = points[0];

//         if (max == 0) return dp[0];

//         dp[1] = Math.max(points[0], points[1]);

//         for (int i = 2; i <= max; i++) {

//             int pick = points[i] + dp[i - 2];

//             int notPick = dp[i - 1];

//             dp[i] = Math.max(pick, notPick);
//         }

//         return dp[max];
//     }
// }