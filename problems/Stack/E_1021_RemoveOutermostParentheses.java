class Solution {
    public String removeOuterParentheses(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(!stack.isEmpty()){
                    sb.append('(');
                }
                stack.push('(');
            }
            else {
                stack.pop();
                if(!stack.isEmpty()){
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }
}