class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(char c: address.toCharArray()){
            if(c=='.'){
                sb = sb.append("[.]");
            }
            else{
                sb = sb.append(c);
            }
        }
        return sb.toString();
    }
}

//or

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}