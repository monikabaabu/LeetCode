class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int mask =0;
        for(char c:allowed.toCharArray()){
            mask = mask|(1<<(c-'a'));
        }
        int count=0;
        for(String s:words){
            boolean valid = true;
            for(char c: s.toCharArray()){
                if((mask&(1<<(c-'a')))==0){
                    valid = false;
                    break;
                }
            }
            if(valid) count++;
        }
        return count;
    }
}