class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low =0;
        int high = mat[0].length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            int col = mid;
            int max = Integer.MIN_VALUE;
            int row=0;
            for(int i=0;i<mat.length;i++){
                if(mat[i][col]>max){
                    max = mat[i][col];
                    row=i;
                }
            }
            int left  = (col > 0) ? mat[row][col-1] : -1;
            int right = (col < mat[0].length-1) ? mat[row][col+1] : -1;

            if( max > right && max > left ){
                return new int[] {row,col};
            }
            else if(max < right){
                low = mid +1;
            }
            else{
                high = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}