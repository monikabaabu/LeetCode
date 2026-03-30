class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        int oldcolor = image[sr][sc];
        dfs(image,oldcolor,color,sr,sc);
        return image;
    }
    private static void dfs(int[][] image, int oldcolor, int color, int r, int c){
        if(r<0 || r>=image.length || c<0 || c>= image[0].length ){
            return;
        }

        if(image[r][c]!=oldcolor){
            return;
        }
        image[r][c] = color;
        dfs(image,oldcolor,color,r+1,c);
        dfs(image,oldcolor,color,r-1,c);
        dfs(image,oldcolor,color,r,c+1);
        dfs(image,oldcolor,color,r,c-1);
    }
}