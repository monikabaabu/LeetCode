class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l =0;
        int r = 0;
        int max =0;
        long sum=0;
        while(r < nums.length){
            sum+=nums[r];
            if((long)nums[r]*(r-l+1) > sum+k ){
                sum-=nums[l];
                l++;

            }
            max = Math.max(max,r-l+1);
            r++;

        }
        return max;
    }
}