class Solution {
    public void moveZeroes(int[] nums) {
        int size=nums.length;
        int count=0;
        for(int i=0; i<size; i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        for( int j= count; j<size; j++){
            nums[j]=0;
        }
    }


}