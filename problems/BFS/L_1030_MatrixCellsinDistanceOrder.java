class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows*cols][2];
        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {rCenter,cCenter});
        visited[rCenter][cCenter]= true;
        int[] dr = {1,-1,0,0};
        int[] dc = {0,0,1,-1};
        int idx=0;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            ans[idx++] = curr;
            for(int i=0;i<4;i++){
                int nr = curr[0] +dr[i];
                int nc = curr[1] + dc[i];

                if(nr>=0 && nr< rows && nc >=0 && nc<cols && !visited[nr][nc]){
                    q.offer(new int[]{nr,nc});
                    visited[nr][nc]=true;
                }
            }
        }
        return ans;

    }
}