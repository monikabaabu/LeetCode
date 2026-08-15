class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;

        int[] arr = new int[m * n];

        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[k++] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int y = arr[arr.length / 2];
        int o = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - y) % x != 0)
                return -1;
            o += Math.abs(arr[i] - y) / x;
        }
        return o;

    }
}