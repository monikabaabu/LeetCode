class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int j=0;
        int curr=0;
        int max =0;
        for(int i=0;i<s.length();i++){
            curr += Math.abs(s.charAt(i) - t.charAt(i));
            while (curr > maxCost) {
                curr-= Math.abs(s.charAt(j) - t.charAt(j));
                j++;
            }

            max = Math.max(max, i-j+ 1);

        }
        return max;
    }
}