class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max =0;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            max= Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int left = max;
        int right = sum;
        int ans=0;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(Days(weights,mid)<=days){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
    private static int Days(int[] w, int cap){
        int load =0;
        int days =1;
        for(int i=0;i<w.length;i++){
            if(load+w[i]> cap){
                days = days+1;
                load = w[i];
            }
            else{
                load+=w[i];
            }
        }
        return days;
    }
}