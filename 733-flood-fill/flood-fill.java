class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int cColor = image[sr][sc];
        dfs(image,cColor,sr,sc,color);
        return image;
    }

    public static void dfs(int[][] grid,int cColor,int i,int j,int color){
        if( i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != cColor || grid[i][j] == color)
            return;
        if(grid[i][j] == cColor){
            grid[i][j] = color;
        }
        dfs(grid,cColor,i,j+1,color);
        dfs(grid,cColor,i-1,j,color);
        dfs(grid,cColor,i,j-1,color);
        dfs(grid,cColor,i+1,j,color);
    }
}

