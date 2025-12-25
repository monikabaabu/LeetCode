class Solution {
    public int largestAltitude(int[] gain) {
        int[] res = new int[gain.length+1];
        int max = 0;
        for(int i=0;i<gain.length;i++){
            res[i+1]=res[i]+gain[i];
            max = Math.max(max,res[i+1]);
        }
        return max;
    }
}