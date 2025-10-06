class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] coins = new int[n+2];
        coins[0] =1;
        coins[n+1]=1;
        for(int i=0;i<n;i++){
            coins[i+1]= nums[i];
        }
        int[][] dp = new int[n+2][n+2];
        for(int len =2; len< n+2;len++){
            for(int left =0;left<n+2-len;left++){
                int right = left+len;
                for(int k = left+1; k<right;k++){
                    dp[left][right] = Math.max(dp[left][right], dp[left][k]+dp[k][right]+coins[left]*coins[k]*coins[right]);
                }
            }
        }
        return dp[0][n+1];
    }
}