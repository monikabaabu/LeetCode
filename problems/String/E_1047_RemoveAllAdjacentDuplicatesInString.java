class Solution {
    public String removeDuplicates(String s) {
        if(s.length()==0){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(sb.length()>0 && s.charAt(i)==sb.charAt(sb.length()-1)){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}