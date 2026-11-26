class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int[][] vis = new int[n][m];
        int cntfresh =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j,0});
                    vis[i][j] = 2;
                }
                if(grid[i][j]==1) cntfresh++;
            }
        }
        int time =0;
        int ct=0;
        int[] row = {-1,0,1,0};
        int[] col = {0,1,0,-1};
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            int t = curr[2];
            time = Math.max(time,t);
            for(int i=0;i<4;i++){
                int nr = r+row[i];
                int nc = c+col[i];
                if(nr >=0 && nr<n && nc>=0 && nc<m && vis[nr][nc] ==0 && grid[nr][nc] ==1){
                    q.offer(new int[] {nr,nc,t+1});
                    vis[nr][nc]=2;
                    ct++;
                }
            }
        }
        if(ct!=cntfresh) return -1;
        return time;
    }
}