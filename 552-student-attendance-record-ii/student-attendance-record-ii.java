class Solution {
    private static final int M = 1000000007;
    private int[][][] t;
    public int checkRecord(int n) {
        t = new int[n + 1][2][3];
        for(int i = 0; i <= n; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    t[i][j][k] = -1;
                }
            }
        }
        return solve(n, 0, 0); 
    }
    private int solve(int n, int absent, int consecutiveLate) {
        // Base cases
        if (absent >= 2 || consecutiveLate >= 3) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (t[n][absent][consecutiveLate] != -1) {
            return t[n][absent][consecutiveLate];
        }

        // Recurrence relations
        int A = solve(n - 1, absent + 1, 0) % M;
        int L = solve(n - 1, absent, consecutiveLate + 1) % M;
        int P = solve(n - 1, absent, 0) % M;

        return t[n][absent][consecutiveLate] = ((A + L) % M + P) % M;
    }
}