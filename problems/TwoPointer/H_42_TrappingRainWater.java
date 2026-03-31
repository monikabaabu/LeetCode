class Solution {
    public int trap(int[] height) {
        int  n = height.length;
        int l=0;
        int r=n-1;
        int lMax=0;
        int rMax=0;
        int tot=0;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]<lMax){
                    tot+=lMax-height[l];

                }
                else{
                    lMax=height[l];
                }
                l++;
            }
            else{
                if(height[r]<rMax){
                    tot+=rMax-height[r];

                }
                else{
                    rMax = height[r];
                }
                r--;
            }
        }
        return tot;
    }
}

//or


class Solution {
    public int trap(int[] height) {
        int  n = height.length;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];
        prefixMax[0] = height[0];
        for(int i=1;i<n;i++){
            prefixMax[i] = Math.max(prefixMax[i-1],height[i]);
        }
        suffixMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            suffixMax[i] = Math.max(suffixMax[i+1],height[i]);
        }
        int tot =0;
        for(int i=0;i<n;i++){
            if(height[i]<prefixMax[i] && height[i]<suffixMax[i]){
                tot+= Math.min(prefixMax[i],suffixMax[i]) - height[i];
            }
        }
        return tot;
    }
}



