class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        while(i<name.length() && j<typed.length()){
            char c = name.charAt(i);
            if(c == typed.charAt(j)){
                i++;
                j++;
            }
            else if(i-1>-1 && typed.charAt(j)==name.charAt(i-1)) j++;
            else return false;


        }
        while(j<typed.length()){
            if(typed.charAt(j)!=name.charAt(i-1)) return false;
            j++;
        }
        return i==name.length() ;
    }
}