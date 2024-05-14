class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int freshOranges = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    freshOranges++;
                }
            }
        }
        
        if(freshOranges == 0) return 0;
        if(q.isEmpty()) return -1;
        int minute = 0;

            while(!q.isEmpty()){
                int size = q.size();
                for(int k=0;k<size;k++){
                    int[] cell = q.poll();
                    int x = cell[0];
                    int y = cell[1];
                    if(isSafe(x+1,y,n,m) && grid[x+1][y] == 1){
                        grid[x+1][y] = 2;
                        q.add(new int[]{x+1,y});
                        freshOranges--;
                    }
                    if(isSafe(x-1,y,n,m) && grid[x-1][y] == 1){
                        grid[x-1][y] = 2;
                        q.add(new int[]{x-1,y});
                        freshOranges--;
                    }
                    if(isSafe(x,y+1,n,m) && grid[x][y+1] == 1){
                        grid[x][y+1] = 2;
                        q.add(new int[]{x,y+1});
                        freshOranges--;
                    }
                    if(isSafe(x,y-1,n,m) && grid[x][y-1] == 1){
                        grid[x][y-1] = 2;
                        q.add(new int[]{x,y-1});
                        freshOranges--;
                    }
                }
                minute++;
            }
        return freshOranges == 0 ? minute-1 : -1;
    }
    private static boolean isSafe(int x,int y,int r,int c){
        return ( (x>=0 && y>=0) && (x < r && y < c));

    }
}
