class Solution {
    private static boolean search(char[][] board, String word,int r, int c, int i){
        if(i== word.length()){
            return true;
        }
        if(r<0 || r>= board.length || c<0 || c>= board[0].length || board[r][c] != word.charAt(i)){
            return false;
        }

        char temp = board[r][c];
        board[r][c] = '0';
        boolean found = search(board,word,r-1,c,i+1) ||
                search(board,word,r+1,c,i+1) ||
                search(board,word,r,c-1,i+1) ||
                search(board,word,r,c+1,i+1);
        board[r][c] = temp;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        boolean res = false;
        for(int i=0;i< board.length;i++){
            for(int j=0; j< board[0].length;j++){
                if(board[i][j] == word.charAt(0)){
                    res = search(board, word,i,j, 0);
                    if(res){
                        break;
                    }
                }
            }
            if(res){
                break;
            }
        }
        return res;
    }
}