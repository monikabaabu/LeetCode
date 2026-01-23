class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String t = (s + s).substring(1, 2*s.length() - 1);
        if(t.contains(s)){
            return true
        }

    }
}