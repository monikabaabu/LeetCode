class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1count = new int[26];
        int[] s2count = new int[26];
        for(char c: s1.toCharArray()){
            s1count[c-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            s2count[s2.charAt(i)-'a']++;
            if(i>=s1.length()){
                s2count[s2.charAt(i-s1.length())-'a']--;
            }
            if(Arrays.equals(s1count,s2count)){
                return true;
            }
        }

        return false;
    }
}