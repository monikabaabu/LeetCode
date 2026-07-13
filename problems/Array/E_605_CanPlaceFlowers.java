class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length && n>0 ;i++){
            int l = (i==0)? 0 : flowerbed[i-1];
            int r = (i==flowerbed.length-1) ? 0 : flowerbed[i+1];
            if(l ==0 && r==0 && flowerbed[i]==0){
                flowerbed[i]=1;
                n--;
            }
        }
        return n==0;
    }
}