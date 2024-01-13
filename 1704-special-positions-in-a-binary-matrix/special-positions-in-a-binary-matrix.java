class Solution {
    public int numSpecial(int[][] matrix) {
        int countSpecial=0;
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(matrix[row][col]==1){
                    int rowSum = 0;
                    int colSum = 0;
                    for(int k=0;k<matrix.length;k++){
                        rowSum += matrix[k][col];
                    }
                    for(int k=0;k<matrix[0].length;k++){
                        colSum += matrix[row][k];
                    }

                    if(rowSum==1 && colSum==1){
                        countSpecial++;
                    }
                }
            }
        }
        return countSpecial;
    }
}