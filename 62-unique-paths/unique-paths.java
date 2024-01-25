class Solution {
    
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        return helper(m - 1, n - 1, memo);
    }

    private int helper(int i, int j, int[][] memo) {
        if (i == 0 || j == 0)
            return 1;

        if (memo[i][j] != 0)
            return memo[i][j];

        memo[i][j] = helper(i - 1, j, memo) + helper(i, j - 1, memo);
        return memo[i][j];
    }
}