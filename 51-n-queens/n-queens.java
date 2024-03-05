class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[][] board = new int[n][n];
        solveNQueensHelper(board, 0, result);
        return result;
    }
    public void solveNQueensHelper(int[][] board, int row, List<List<String>> result) {
        if (row == board.length) {
            result.add(generateSolution(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                solveNQueensHelper(board, row + 1, result);
                board[row][col] = 0;
            }
        }
    }
    private List<String> generateSolution(int[][] board) {
        List<String> solution = new ArrayList<>();
        for (int[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (int cell : row) {
                sb.append(cell == 1 ? 'Q' : '.');
            }
            solution.add(sb.toString());
        }
        return solution;
    }

    public boolean isSafe(int[][] board, int row, int col) {
        for (int r = row - 1; r >= 0; r--) {
            if (board[r][col] == 1) return false;
        }

        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 1) return false;
        }

        for (int r = row, c = col; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 1) return false;
        }

        return true;
    }

}