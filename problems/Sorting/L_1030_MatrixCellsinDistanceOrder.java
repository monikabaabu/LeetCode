class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                list.add(new int[]{Math.abs(i-rCenter)+Math.abs(j-cCenter),i,j});
            }
        }
        list.sort((a, b) -> Integer.compare(a[0], b[0]));
        int[][] ans = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            ans[i][0] = list.get(i)[1];
            ans[i][1] = list.get(i)[2];
        }
        return ans;

    }
}