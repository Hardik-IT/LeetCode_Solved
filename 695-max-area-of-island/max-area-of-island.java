class Solution {
    public static int t = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int area = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    t=0;
                    dfs(grid,i,j);
                    area = Math.max(area,t);
                }
            }
        }
        return area;
    }
    public static void dfs(int[][] grid,int i,int j){
        if( i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
            return;
        t++;
        grid[i][j] = 0;
        dfs(grid,i,j+1);
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
        dfs(grid,i+1,j);
    }
}