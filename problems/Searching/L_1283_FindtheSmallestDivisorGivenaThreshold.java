class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l =1;
        int r = 0;
        for(int n:nums){
            r= Math.max(r,n);
        }
        int ans =0;
        while(l<=r){
            int m = l +(r-l)/2;
            if(possi(nums,threshold,m)){
                ans =m;
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    private static boolean possi(int[] nums, int t, int n){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += (nums[i] + n - 1) / n;

        }
        return sum<=t;
    }
}