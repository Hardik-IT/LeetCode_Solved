class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    sum+=mat[i][j];
                    sum+=mat[i][m-i-1];
                }
            }
        }
        if(m%2!=0){
            sum-=mat[m/2][m/2];
        }
        return sum;
    }
}