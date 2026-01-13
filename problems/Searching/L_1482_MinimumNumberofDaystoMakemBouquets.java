class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int[] sorted = bloomDay.clone();
        Arrays.sort(sorted);
        int l =0;
        int r = sorted.length-1;
        int ans =-1;
        while(l<=r){
            int mid  = l +(r-l)/2;
            if(possi(bloomDay,m,k,sorted[mid])){
                ans = sorted[mid];
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;

    }
    private static boolean possi(int[] arr, int m,int k,int n){
        int count =0;
        int bouquet=0;

        for(int i=0;i<arr.length;i++){
            if (arr[i] <= n) {
                count++;

            } else {
                bouquet+=count/k;
                count = 0;
            }
        }
        bouquet+=count/k;
        if(bouquet>=m){
            return true;
        }
        return false;
    }
}