class Solution {
   public int diagonalSum(int[][] mat) {
       int m=mat.length;
       int sum=0;
       for(int i=0;i<mat.length;i++){
           sum+=mat[i][i];
           sum+=mat[i][m-i-1];
       }
       if(m%2!=0){
           sum-=mat[m/2][m/2];
       }
       return sum;
    }
}