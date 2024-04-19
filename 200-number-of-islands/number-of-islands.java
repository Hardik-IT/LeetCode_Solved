class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis = new int[n][m];
        int count=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(vis[row][col] == 0 && grid[row][col]=='1'){
                    count++;
                    bfs(row,col,vis,grid);
                }
            }
        }
        return count;
    }
    private void bfs(int row,int col,int[][] vis,char[][] grid){
        vis[row][col] = 1;
        Queue<Pair> queue= new LinkedList<>();
        queue.add(new Pair(row,col));
        int n = grid.length;
        int m = grid[0].length;
        while(!queue.isEmpty()){
            int first = queue.peek().first;
            int second = queue.peek().second;
            
            queue.remove();
            // Neighbors' directions: North, South, East, West
            int[] dr = {-1, 1, 0, 0}; // change here
            int[] dc = {0, 0, 1, -1}; // change here
            for(int i=0;i<4;i++){
                    int nrow = first + dr[i];
                    int ncol = second + dc[i];
                    if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0)
                    {
                        vis[nrow][ncol] = 1;
                        queue.add(new Pair(nrow,ncol));
                    }
            }
            
        }
    }
}