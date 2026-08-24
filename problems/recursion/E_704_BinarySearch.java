class Solution {
    public int search(int[] nums, int target) {

        int ans = rec(nums,target,0,nums.length-1);
        return ans;
    }

    private static int  rec(int[] nums, int target, int l, int r){
        if(l>r) return -1;
        int m = l + (r-l)/2;
        if(nums[m]==target){

            return m;
        }
        else if (nums[m]>target) return rec(nums,target,l,m-1);
        return rec(nums, target, m+1, r);

    }
}