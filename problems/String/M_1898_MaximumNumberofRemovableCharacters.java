class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int ans =0;
        int l=0;
        int r = removable.length;
        while(l<=r){
            int m = l+(r-l)/2;
            if(remove(s,p,removable,m)){
                ans = m;
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return ans;
    }
    private static boolean remove(String s, String p, int[] removable, int k){
        boolean[] removed = new boolean[s.length()];
        for(int i=0;i<k;i++){
            removed[removable[i]]=true;
        }
        int j=0;
        for(int i=0;i<s.length()&& j<p.length();i++){
            if(removed[i]){
                continue;
            }
            if(s.charAt(i)==p.charAt(j)){
                j++;
            }
        }
        return j==p.length();
    }
}
