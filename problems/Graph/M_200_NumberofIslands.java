//bfs:


class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        int[][] directions = {
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i, j});
                    grid[i][j] = '0';
                    while (!q.isEmpty()) {
                        int[] cell = q.poll();
                        int r = cell[0];
                        int c = cell[1];
                        for (int[] d : directions) {
                            int nr = r + d[0];
                            int nc = c + d[1];
                            if (nr >= 0 && nc >= 0 &&
                                    nr < m && nc < n &&
                                    grid[nr][nc] == '1') {
                                grid[nr][nc] = '0';
                                q.add(new int[]{nr, nc});
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}

// dfs:
// class Solution {
//     public void dfs(char[][] grid, int r, int c) {
//         int m = grid.length;
//         int n = grid[0].length;
//         if (r < 0 || c < 0 || r >= m || c >= n ||
//             grid[r][c] == '0') {
//             return;
//         }
//         grid[r][c] = '0';
//         dfs(grid, r + 1, c);
//         dfs(grid, r - 1, c);
//         dfs(grid, r, c + 1);
//         dfs(grid, r, c - 1);
//     }
//     public int numIslands(char[][] grid) {
//         int m = grid.length;
//         int n = grid[0].length;
//         int count = 0;
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (grid[i][j] == '1') {
//                     count++;
//                     dfs(grid, i, j);
//                 }
//             }
//         }
//         return count;
//     }
// }