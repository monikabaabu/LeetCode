class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = intervals[i][0];
            arr[i][1] =i;
        }
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        int[] res = new int[n];
        Arrays.fill(res,-1);

        for(int i=0;i<n;i++){
            int l=0,r = n-1;
            while(l<=r){
                int m = l +(r-l)/2;
                if(arr[m][0]==intervals[i][1]){
                    res[i]= arr[m][1];
                    break;
                }
                else if(arr[m][0]> intervals[i][1]){
                    r = m-1;
                }
                else{
                    l=m+1;
                }
            }
            if(res[i]==-1 && l<n ){
                res[i] = arr[l][1];
            }
        }
        return res;



    }
}