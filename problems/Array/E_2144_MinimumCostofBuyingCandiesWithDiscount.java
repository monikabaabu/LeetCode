class Solution {
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);
        int c=0;
        int n= cost.length;
        for(int i=n-1;i>=0;i--){
            if((n-1-i)%3 !=2) c+=cost[i];
        }

        return c;
    }
}