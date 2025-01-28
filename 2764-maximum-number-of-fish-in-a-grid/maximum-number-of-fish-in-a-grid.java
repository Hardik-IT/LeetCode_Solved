class Solution {
    private int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    
    public int findMaxFish(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int maxFish = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    maxFish = Math.max(maxFish, dfs(grid, i, j));
                }
            }
        }
        return maxFish;
    }

    private int dfs(int[][] grid, int r, int c) {
        int m = grid.length, n = grid[0].length;

        if (r < 0 || c < 0 || r >= m || c >= n || grid[r][c] == 0) return 0;

        int fish = grid[r][c];
        grid[r][c] = 0;

        for (int[] dir : directions) {
            fish += dfs(grid, r + dir[0], c + dir[1]);
        }
        return fish;
    }
}
