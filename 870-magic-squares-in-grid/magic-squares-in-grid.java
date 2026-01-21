class Solution {
    public int numMagicSquaresInside(int[][] grid) {
         int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

     private boolean isMagicSquare(int[][] grid, int row, int col) {
        // Check if all numbers are distinct and within 1 to 9
        boolean[] seen = new boolean[10];
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                int num = grid[i][j];
                if (num < 1 || num > 9 || seen[num]) {
                    return false;
                }
                seen[num] = true;
            }
        }

        // Calculate the sum of the first row for comparison
        int sum = grid[row][col] + grid[row][col + 1] + grid[row][col + 2];

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (grid[row + i][col] + grid[row + i][col + 1] + grid[row + i][col + 2] != sum) {
                return false;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (grid[row][col + j] + grid[row + 1][col + j] + grid[row + 2][col + j] != sum) {
                return false;
            }
        }

        // Check diagonals
        if (grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2] != sum) {
            return false;
        }
        if (grid[row + 2][col] + grid[row + 1][col + 1] + grid[row][col + 2] != sum) {
            return false;
        }

        return true;
    }
}