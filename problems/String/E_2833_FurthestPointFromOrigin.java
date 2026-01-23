class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0;

        int x=0;
        for(char ch: moves.toCharArray()){
            switch(ch){
                case 'L': l++;
                    break;
                case 'R' : l--;
                    break;
                case '_' : x++;
            }
        }
        return Math.abs(l)+x;
    }
}