class Solution {
    public int missingNumber(int[] nums) {
        boolean[] vis = new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            vis[nums[i]]=true;
        }
        for(int i=1;i<nums.length+1;i++){
            if(vis[i]!=true){
                return i;
            }

        }
        return 0;
    }
}