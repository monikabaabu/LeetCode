class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int c=1;
        for(int i=0;i<chars.length;i++){
            if(i+1<chars.length && chars[i]==chars[i+1]) c++;
            else{
                sb=sb.append(chars[i]);
                if(c>1) sb = sb.append(c);
                c=1;

            }
        }

        String s = sb.toString();
        for(int i=0;i<s.length();i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}