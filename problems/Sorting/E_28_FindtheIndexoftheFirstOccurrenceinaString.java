class Solution {
    public int strStr(String haystack, String needle) {
        int l=0;
        int r=0;
        int idx=0;
        if(haystack.length()<needle.length()){
            return -1;
        }
        while(r<haystack.length() && idx<needle.length()){
            if(haystack.charAt(r)==needle.charAt(idx)){
                if(idx==needle.length()-1){
                    return l;
                }
                r++;
                idx++;
            }
            else{
                idx=0;
                l++;
                r=l;
            }

        }
        return -1;
    }
}