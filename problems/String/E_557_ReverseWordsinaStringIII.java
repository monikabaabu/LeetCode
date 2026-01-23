class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String w : word){
            result.append(new StringBuilder(w).reverse()).append(" ");
        }
        return result.toString().trim();
    }
}