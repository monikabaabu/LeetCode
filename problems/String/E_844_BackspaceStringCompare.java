class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = check(s);
        String s2 = check(t);
        return s1.equals(s2);
    }
    private static String check(String s){
        // Stack<Character> st = new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     if(!st.isEmpty() && s.charAt(i)=='#'){
        //         st.pop();
        //     }
        //     else if(s.charAt(i)!='#'){
        //         st.push(s.charAt(i));
        //     }
        // }
        // StringBuilder sb = new StringBuilder();
        // while(!st.isEmpty()){
        //     sb = sb.append(st.pop());
        // }
        // sb = sb.reverse();
        // return sb.toString();
        int i=0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}