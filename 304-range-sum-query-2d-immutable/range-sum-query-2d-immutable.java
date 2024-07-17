class NumMatrix {
    int matrix[][];
    int psum[][];
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        psum = new int[matrix.length][matrix[0].length];
        fillPrefixSum();
    }
    public void fillPrefixSum(){
        psum[0][0] = matrix[0][0];
       
        for(int i=1; i < psum[0].length; i++){
            psum[0][i] = psum[0][i-1] + matrix[0][i];
        }
        for(int i=1; i < psum.length; i++){
            psum[i][0] = psum[i-1][0] + matrix[i][0];
        }

        for(int r = 1; r < psum.length; r++){
            for(int c = 1; c < psum[0].length; c++){
                psum[r][c] = psum[r-1][c] + psum[r][c-1] - psum[r-1][c-1] + matrix[r][c];
            }
        }   
    }
    
    public int getVal(int r,int c){
        if(r < 0 || c < 0) return 0;
        return psum[r][c];
    }
    public int sumRegion(int tlr, int tlc, int brr, int brc) {
            int s = getVal(brr,brc);
            int a = getVal(tlr - 1, brc);
            int b = getVal(brr,tlc - 1);
            int c = getVal(tlr-1,tlc-1);
            return s - a - b + c;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */