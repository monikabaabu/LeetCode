class Solution {
    public boolean judgeCircle(String moves) {
        int i =0, j=0;
        for(char ch : moves.toCharArray()){
            switch (ch){
                case 'U':
                    j++;
                    break;
                case 'D':
                    j--;
                    break;
                case 'R':
                    i++;
                    break;
                case 'L':
                    i--;
                    break;
                default:
                    break;
            }
        }

        if(i==0 && j==0){
            return true;
        }
        return false;
    }
}