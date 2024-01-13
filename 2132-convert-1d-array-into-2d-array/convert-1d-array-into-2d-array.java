class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int total = original.length;
        if (m * n != total) {
            return new int[0][0];
        }

        int[][] answer = new int[m][n];
        int k = 0;

        // M iterations
        // Pick N elements each
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                if (k < total) {
                    answer[i - 1][j] = original[k];
                    k++;
                } else {
                    break;  // Stop if no elements in the array
                }
            }
        }

        return answer;
    }
}