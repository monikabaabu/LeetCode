class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];

        int e=0;
        int o=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[e]=nums[i];
                e+=2;
            }
            else{
                res[o]=nums[i];
                o+=2;
            }
        }
        return res;
    }
}