class Solution {
    public void dfs( char[][] board,boolean[][] vis, int row, int col){
        if(row<0 || col <0 || row>= board.length || col>=board[0].length ){
            return;
        }
        if(board[row][col] !='O' || vis[row][col]) return;
        vis[row][col]= true;
        dfs(board,vis,row+1,col);
        dfs(board,vis,row-1,col);
        dfs(board,vis,row,col+1);
        dfs(board,vis,row,col-1);
    }

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] vis = new boolean[m][n];
        for(int i=0;i<m;i++){
            if(board[i][0] == 'O') dfs(board,vis,i,0);
            if(board[i][n-1] =='O') dfs(board,vis,i,n-1);
        }
        for(int j=0;j<n;j++){
            if(board[0][j]=='O') dfs(board,vis,0,j);
            if(board[m-1][j]=='O') dfs(board,vis,m-1,j);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O' && !vis[i][j]){
                    board[i][j]='X';

                }
            }
        }

    }
}