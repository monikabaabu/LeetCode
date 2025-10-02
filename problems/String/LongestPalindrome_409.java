class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for(char c: s.toCharArray()){
            count[c]++;
        }
        int length =0;
        boolean odd = false;
        for( int i : count){
            length += (i/2)*2;
            if(i%2==1){
                odd = true;
            }
        }
        if(odd){
            length++;
        }
        return length;
    }
}