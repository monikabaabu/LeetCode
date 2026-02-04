class Solution {
    static int max;
    public int getMaximumGold(int[][] grid) {
        max=0;
        int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>0){
                    path(grid,i,j,sum);
                }
            }
        }
        return max;
    }
    private static void path(int[][] grid,int i, int j, int sum){
        if(i<0 || i>= grid.length || j<0 || j>=grid[0].length || grid[i][j] == 0 ){
            return;
        }
        int gold = grid[i][j];
        sum += gold;
        max = Math.max(max,sum);
        grid[i][j] = 0;
        path(grid,i+1,j,sum);
        path(grid,i,j+1,sum);
        path(grid,i,j-1,sum);
        path(grid,i-1,j,sum);
        grid[i][j] = gold;
    }
}