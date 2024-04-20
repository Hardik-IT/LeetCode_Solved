class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int minR=0,minC=0,maxC=n-1,maxR=n-1;
        int c=1;
        while(c <= n*n){
            //top wall
            for(int col=minC;col <= maxC;col++){
                matrix[minR][col] = c;
                c++;
            }
            minR++;
            //right wall
            for(int row=minR;row <= maxR;row++){
                matrix[row][maxC] = c;
                c++;
            }
            maxC--;
            //bottom wall
            for(int col = maxC; col>= minC;col--){
                matrix[maxR][col] = c;
                c++;
            }
            maxR--;
            //left wall
            for(int row=maxR; row >= minR; row--){
                matrix[row][minC] = c;
                c++;
            }
            minC++;
        }
        return matrix;
    }
}