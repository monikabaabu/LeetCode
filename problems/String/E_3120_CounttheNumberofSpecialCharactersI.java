class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] low = new boolean[26];
        boolean[] up = new boolean[26];
        for(char c: word.toCharArray()){
            if(c>='a' && c<='z'){
                low[c-'a']=true;
            }
            if(c>='A' && c<='Z'){
                up[c-'A']=true;
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(low[i]&&up[i]){
                count++;
            }
        }
        return count;
    }
}