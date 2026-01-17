class Solution {
    public int numberOfSpecialChars(String word) {
        int[] freq = new int[26];
        for(char c: word.toCharArray()){
            int idx = Character.toLowerCase(c)-'a';
            if(Character.isLowerCase(c)){
                if(freq[idx]==0){
                    freq[idx]=1;
                }
                else if(freq[idx]==2){
                    freq[idx]=-1;
                }
            }
            else if(Character.isUpperCase(c)){
                if (freq[idx] == 0) {
                    freq[idx] = -1;
                } else if (freq[idx] == 1) {
                    freq[idx] = 2;
                }
            }
        }
        int count=0;
        for(int n:freq){
            if(n==2){
                count++;
            }
        }
        return count;
    }
}