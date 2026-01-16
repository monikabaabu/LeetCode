class Solution {
    public String interpret(String command) {
        String result ="";
        result = command.replace("()","o");
        result = result.replace("(al)","al");
        return result;
    }
}

//or

class Solution {
    public String interpret(String command) {
        int i=0;
        String ans="";
        while(i<command.length()){
            if(command.charAt(i)=='G'){
                ans+="G";
                i+=1;
            }else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                ans+="o";
                i+=2;
            }else if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                ans+="al";
                i+=4;
            }
        }
        return ans;
    }
}