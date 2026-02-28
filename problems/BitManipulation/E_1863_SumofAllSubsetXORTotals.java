class Solution {
    public int subsetXORSum(int[] nums) {
        int or =0;
        for(int n: nums){
            or|=n;
        }
        return or << (nums.length-1);
    }
}