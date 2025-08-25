class Solution {
    public boolean isPowerOfTwo(int n) {
        long num=n;
        if(num==0){
            return false;
        }
        return(num&(num-1))==0;
    }
}