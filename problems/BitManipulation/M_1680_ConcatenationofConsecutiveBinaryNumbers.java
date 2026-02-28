class Solution {
    public int concatenatedBinary(int n) {
        int mod = 1000000007;
        int bit=0;
        long res=0;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0){
                bit++;
            }
            res = ((res<<bit)%mod+i)%mod;
        }
        return (int) res;
    }
}