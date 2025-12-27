class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[s]<=nums[m] ){
                ans = Math.min(ans,nums[s]);
                s = m+1;
            }
            else {
                ans = Math.min(ans,nums[m]);
                e = m-1;
            }
        }
        return ans;
    }
}