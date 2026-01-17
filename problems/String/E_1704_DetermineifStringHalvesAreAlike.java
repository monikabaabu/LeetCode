class Solution {
    public boolean halvesAreAlike(String s) {
        String v = "aeiouAEIOU";
        int c1=0,c2=0;
        int m = s.length()/2;
        for(int i=0;i<m;i++){
            if(v.indexOf(s.charAt(i))!=-1) c1++;
            if(v.indexOf(s.charAt(i+m))!=-1) c2++;
        }
        return c1==c2;
    }

}