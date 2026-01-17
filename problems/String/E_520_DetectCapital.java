class Solution {
    public boolean detectCapitalUse(String word) {
        String up = word.toUpperCase();
        String low = word.toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb = sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase());
        String cap = sb.toString();
        if(word.equals(up) || word.equals(low) || word.equals(cap)){
            return true;
        }
        return false;
    }
}

//or

class Solution {
    public boolean detectCapitalUse(String word) {
        int cap=0;
        for(int i=0;i< word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                cap++;
            }
        }
        if(cap==0) return true;
        if(cap==1 && Character.isUpperCase(word.charAt(0))) return true;
        if(cap==word.length()) return true;
        return false;
    }
}