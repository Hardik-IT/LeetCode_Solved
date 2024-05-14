class Solution {
    public int getMaximumGold(int[][] grid) {
        int n = grid.length, m = grid[0].length, ans = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (grid[i][j] != 0) ans = Math.max(ans, dfs(grid, i, j));
            }
        }
        return ans;
    }
    public int dfs(int[][] grid, int row, int col){
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] <= 0) {
            return 0;
        }

        grid[row][col] = -grid[row][col]; //visited

        int down = dfs(grid, row+1, col);
        int right = dfs(grid, row, col+1);
        int up = dfs(grid, row-1, col);
        int left = dfs(grid, row, col-1);

        grid[row][col] = -grid[row][col]; //unmark visited

        return grid[row][col] + Math.max(Math.max(left, right), Math.max(up, down));
    } 
}
