class Solution {
    public int calculate(String S) {
        Stack<Integer> stack = new Stack<>();
        int num=0;
        char s = '+';
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10 + ch -'0';
            }
            if((!Character.isDigit(ch) && ch!=' ')|| i==S.length()-1){
                if( s == '+'){
                    stack.push(num);
                }
                else if( s == '-'){
                    stack.push(-num);
                }
                else if( s == '*'){
                    stack.push(stack.pop()*num);
                }
                else if( s== '/'){
                    stack.push(stack.pop()/num);
                }
                num =0;
                s = ch;
            }
        }
        int res =0;
        for(int val : stack){
            res += val;
        }
        return res;
    }
}
