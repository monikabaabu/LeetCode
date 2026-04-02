class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(!stack.empty()&& stack.peek()=='(' && s.charAt(i)==')'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            stack.pop();
            c++;
        }
        return c;
    }
}