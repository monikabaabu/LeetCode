class Solution {
    public void reverseString(char[] s) {
        rec(0,s.length-1,s);
    }
    private static void rec(int l, int r,char[] s){
        if(l>r) return;
        char temp = s[l];
        s[l]=s[r];
        s[r]=temp;
        rec(l+1, r-1, s);
    }
}