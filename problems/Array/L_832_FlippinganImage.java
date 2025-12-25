class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int row[]:image){
            int l=0;
            int r = image.length-1;
            while(l<=r){
                if(l==r){
                    row[l]^=1;
                }
                else{
                    int left = row[l]^=1;
                    int right = row[r]^=1;
                    row[l]=right;
                    row[r]=left;
                }
                l++;
                r--;
            }
        }
        return image;

    }
}