class Solution {
    public boolean validPalindrome(String s) {
        int l=0;
        int r=s.length()-1;

        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                return palindrome(l,r-1,s)|| palindrome (l+1,r,s);
            }
        }
        return true;
    }
    private static boolean palindrome(int l,int r, String s){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            } else {
                r--;
                l++;
            }
        }
        return true;
    }
}