class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r = nums.length-1;
        return nums[l+(r-l)/2];
    }
}