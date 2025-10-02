class Solution {
    private static boolean isvowel(char c){
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) != -1;
    }
    public int maxVowels(String s, int k) {
        int count =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
        }
        max = Math.max(max,count);
        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i-k))){
                count--;
            }
            if(isvowel(s.charAt(i))){
                count++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}