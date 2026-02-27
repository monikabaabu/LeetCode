class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            if(prime(bits(i))){
                c++;
            }
        }
        return c;
    }
    private static int bits(int n){
        int c=0;
        while(n>0){
            if((n&1)==1){
                c++;
            }
            n>>=1;
        }
        return c;
    }
    private static boolean prime(int n){
        if(n==2 || n==3 || n==5 || n==7 || n==11 || n==13 || n==17 || n==19){
            return true;
        }
        return false;
    }
}