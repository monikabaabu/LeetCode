class Solution {
    public String longestPalindrome(String s) {
        int start =0;
        int end =0;
        int max =0;
        if(s==null|| s.length()<1){
            return "";
        }
        for(int i=0;i< s.length();i++){
            int len1 = palindrome( s,i,i);
            int len2 = palindrome(s, i, i+1);
            max = Math.max(len1,len2);
            if(max > end-start){
                start = i- (max-1)/2;
                end = i+ max/2;
            }
        }
        return s.substring(start,end+1);
    }
    private static int palindrome(String s, int left , int right){
        while(left>=0 && right < s.length() && s.charAt(left)== s.charAt(right)){
            left--;
            right++;
        }
        return right - left -1;
    }
}