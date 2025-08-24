class Solution {
    private static void reverse(char[] s,int start, int end){
        if(start >= end){
            return ;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        reverse(s,start+1,end-1);

    }
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
        }
    }
}
