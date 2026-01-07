class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secmax = Long.MIN_VALUE;
        long thrmax= Long.MIN_VALUE;
        for(int n: nums){
            if(n>max){
                thrmax = secmax;
                secmax= max;
                max =n;
            }
            else if(n>secmax && n!=max){
                thrmax = secmax;
                secmax = n;
            }
            else if(n>thrmax && n!=secmax && n!=max ){
                thrmax =n;
            }
        }
        return thrmax != Long.MIN_VALUE ? (int)thrmax : (int)max;
    }
}