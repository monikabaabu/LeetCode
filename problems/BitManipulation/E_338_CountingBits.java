class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i] = check(i);
        }
        return arr;
    }
    private static int check(int n){
        int c=0;
        while(n>0){
            if((n&1)==1) c++;
            n>>=1;
        }
        return c;
    }
}