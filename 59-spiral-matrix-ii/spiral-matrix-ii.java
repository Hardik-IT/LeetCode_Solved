class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int minR=0,minC=0,maxR=n-1,maxC=n-1;
        int count=1;
        while(count <= n*n){

            // top row
            for(int col=minC;col <= maxC; col++){
                matrix[minR][col]=count;
                count++;
            }
            minR++;

            // right col
            for(int row=minR;row<=maxR;row++){
                matrix[row][maxC]=count;
                count++;
            }
            maxC--;

            // left col
            for(int col=maxC;col>=minC;col--){
                matrix[maxR][col]=count;
                count++;
            }
            maxR--;

            // up col
            for(int row=maxR;row>=minR;row--){
                matrix[row][minC]=count;
                count++;
            }
            minC++;
        }
        return matrix;
    }
}