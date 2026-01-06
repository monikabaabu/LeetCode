class Solution {
    public boolean search(int[] nums, int target) {

        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                return true;
            }
            else if(nums[m]==nums[s]&& nums[m]==nums[e]){
                s++;
                e--;
            }
            else if(nums[m]>=nums[s]){
                if(nums[m]>target && nums[s]<=target){

                    e=m-1;
                }
                else{
                    s= m+1;
                }
            }
            else{
                if(nums[m]<target && nums[e]>=target){
                    s = m+1;
                }
                else{
                    e = m-1;
                }
            }
        }
        return false;
    }
}
