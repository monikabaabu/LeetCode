class Solution {
    public int titleToNumber(String columnTitle) {
        int column = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            column = column * 26 +(columnTitle.charAt(i)-'A'+1);

        }
        return column;
    }
}