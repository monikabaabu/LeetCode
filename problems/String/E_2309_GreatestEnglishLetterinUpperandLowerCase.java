class Solution {
    public String greatestLetter(String s) {
        boolean[] low = new boolean[26];
        boolean[] up = new boolean[26];
        for(char c: s.toCharArray()){
            if(c>='a' && c<='z'){
                low[c-'a']=true;
            }
            if(c>='A' && c<='Z'){
                up[c-'A']=true;
            }
        }
        for(int i=25;i>=0;i--){
            if(low[i]&&up[i]){
                return String.valueOf((char)(i + 'A'));
            }
        }
        return "";
    }
}