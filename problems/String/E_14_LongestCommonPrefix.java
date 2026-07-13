class Solution {
    public String longestCommonPrefix(String[] strs) {
        int c=0;
        for(int i=0;i<strs[0].length();i++){
            char ch = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i<strs[j].length() && strs[j].charAt(i)==ch) c++;
                else return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
}