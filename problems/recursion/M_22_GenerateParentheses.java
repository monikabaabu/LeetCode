class Solution {
    public List<String> generateParenthesis(int n) {
        int open =n;
        int close =n;
        List<String> list = new ArrayList<>();
        parenthesis("",list,open,close);
        return list;
    }
    private static void parenthesis(String s, List<String> list, int o, int c){
        if(o==0 && c==0){
            list.add(s);
            return;
        }
        if(o>0){

            parenthesis(s+"(",list,o-1,c);
        }
        if(c>o){
            parenthesis(s+")",list,o,c-1);
        }

    }
}