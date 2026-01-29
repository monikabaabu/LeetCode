class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        return Tsum(nums,target,sum,0);
    }
    private static int Tsum(int[] n, int t, int s, int i){
        if (i == n.length) {
            return s == t ? 1 : 0;
        }
        return Tsum(n,t,s+n[i],i+1) + Tsum(n,t,s-n[i],i+1);
    }
}
