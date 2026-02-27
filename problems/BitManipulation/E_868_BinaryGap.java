class Solution {
    public int binaryGap(int n) {
        int c =-1;
        int max =0;
        if((n&(n-1))==0){
            return 0;
        }
        while(n>0){
            if((n&1)==1){

                c=0;
            }
            else{
                if(c!=-1)
                    c++;
            }
            n>>=1;
            max = Math.max(c,max);

        }
        return max+1;
    }
}