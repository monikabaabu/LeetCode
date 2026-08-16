class Solution {
    public int pivotIndex(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for(int i=nums.length-2;i>=0;i--){
            right[i] = right[i+1]+nums[i+1];

        }
        if(left[0]==right[0]) return 0;
        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1]+nums[i-1];
            if(right[i]==left[i]) return i;
        }

        return -1;

    }
}