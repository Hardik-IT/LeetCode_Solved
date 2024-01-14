class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        if((rows * cols) != (r * c))
             return mat;

        int[][] output = new int[r][c];
        int o_rows = 0;
        int o_cols = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                output[o_rows][o_cols] = mat[i][j];
                o_cols++;
                if(o_cols == c)
                {
                    o_cols = 0;
                    o_rows++;
                }
            }
        }
        
        return output;
    }
}