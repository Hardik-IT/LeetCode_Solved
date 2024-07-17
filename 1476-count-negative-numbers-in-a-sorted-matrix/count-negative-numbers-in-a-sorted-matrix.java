class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        int r = 0;
        int c = grid[0].length-1;
        while(r < rows && c >= 0){
            if(grid[r][c] >= 0){
                r++;
            }else{
                count += rows-r;
                c--;
            }
        }
        return count;
    }
}