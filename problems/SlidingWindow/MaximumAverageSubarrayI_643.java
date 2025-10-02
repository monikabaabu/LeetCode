class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double max =0;
        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        double current =max;
        for(int i=k;i<nums.length;i++){
            current -=nums[i-k];
            current +=nums[i];
            max = Math.max(max,current);
        }
        return max/k;
    }
}