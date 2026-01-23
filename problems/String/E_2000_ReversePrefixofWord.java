class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb =  new StringBuilder();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                sb= sb.append(word.substring(0,i+1)).reverse();
                sb.append(word.substring(i+1,word.length()));
                return sb.toString();
            }
        }
        return word;
    }
}