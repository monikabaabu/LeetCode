class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int p=0;
        int n =1;
        for(int num:nums){
            if(num>0){
                ans[p]=num;
                p+=2;
            }
            else{
                ans[n]=num;
                n+=2;
            }
        }
        return ans;
    }
}