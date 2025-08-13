class Solution  {
    static int steps(int n, int c ){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return steps(n/2,c+1);
        }
        return steps(n-1,c+1);
    }
    public int numberOfSteps(int num) {
        return steps(num,0);
    }
}