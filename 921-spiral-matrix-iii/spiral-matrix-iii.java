class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
      int i = rStart, j = cStart;
        int diri = 0, dirj = 1; // directions to move
        int twice = 2;
        int[][] res = new int[rows * cols][2];
        int count = 0;
        int moves = 1;
        int nextMoves = 2;

        while (count < rows * cols) {
            if (i >= 0 && i < rows && j >= 0 && j < cols) {
                res[count++] = new int[]{i, j};
            }

            i += diri;
            j += dirj;
            moves--;

            if (moves == 0) {
                // Rotate direction 90 degrees clockwise
                int temp = diri;
                diri = dirj;
                dirj = -temp;
                twice--;

                if (twice == 0) {
                    twice = 2;
                    moves = nextMoves;
                    nextMoves++;
                } else {
                    moves = nextMoves - 1;
                }
            }
        }
        return res;
    }
}