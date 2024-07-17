class Solution {
    public int[][] generateMatrix(int n) {
       int[][] matrix = new int[n][n];
       int minR=0,minC=0;
       int maxC=n-1,maxR=n-1;
       int count = 1;
       while(count<= n*n){

            for(int i=minC; i <= maxC; i++){
                matrix[minR][i] = count++;
            }
            minR++;
            for(int i=minR; i <= maxR; i++){
                matrix[i][maxC] = count++;
            }
            maxC--;
            for(int i=maxC ; i >= minC; i--){
                matrix[maxR][i] = count++;
            }
            maxR--;
            for(int i=maxR; i >= minR; i--){
                matrix[i][minC] = count++;
            }
            minC++;
       }
       return matrix;
    }
}