class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int s1 =0;
        int  s2 =0;
        int e1 = g.length -1;
        int e2 = s.length - 1 ;
        int c =0;
        while(s1 <= e1 && s2 <= e2){
            if(g[s1] <= s[s2]){
                c++;
                s1++;
                s2++;
            }
            else{
                s2++;

            }

        }
        return c;
    }
}
