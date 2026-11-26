class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis = new boolean[image.length][image[0].length];
        dfs(sr,sc,color,image,vis, image[sr][sc]);
        return image;
    }
    private static void dfs(int r, int c ,int color, int[][] image, boolean[][] vis ,int n){
        if(r<0 || c<0 || r>= image.length || c >= image[0].length || vis[r][c] || image[r][c] != n ) return;
        vis[r][c] = true;
        image[r][c] = color;
        dfs(r+1,c,color,image,vis,n);
        dfs(r-1,c,color,image,vis,n);
        dfs(r,c+1,color,image,vis, n);
        dfs(r,c-1,color,image,vis, n);
    }
}