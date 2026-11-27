class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dir = { { 0,1} , {0,-1}, {1,0}, {-1,0}};
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(grid[i][0] == 1){
                q.add(new int[]{i,0});
                grid[i][0] = 0;
            }
            if(grid[i][m-1] == 1) {
                q.add(new int[]{i,m-1});
                grid[i][m-1] = 0;
            }
        }
        for(int j=0;j<m;j++){
            if(grid[0][j] == 1){
                q.add(new int[]{0,j});
                grid[0][j] = 0;
            }
            if(grid[n-1][j] == 1) {
                q.add(new int[]{n-1,j});
                grid[n-1][j] = 0;
            }
        }
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            for(int[] d : dir){
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr>=0 && nc >=0 && nr<n && nc < m && grid[nr][nc] == 1 ){
                    q.offer(new int[] {nr,nc});
                    grid[nr][nc] =0;

                }
            }
        }
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}