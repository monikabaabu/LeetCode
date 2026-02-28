class Solution {
    public int subsetXORSum(int[] nums) {
        int xor =0;

        return dfs(nums,0,xor);
    }
    private static int dfs(int[] nums, int i,int xor){
        if(i==nums.length){
            return xor;
        }
        int pick=dfs(nums, i+1,xor^nums[i]);
        int notPick = dfs(nums,i+1,xor);
        return pick+notPick;

    }
}