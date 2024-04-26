class Solution {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] arr = new int[n][m];
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(i==0 || j == 0){
                    if(matrix[i][j] == '1')
                        arr[i][j] = 1;
               }else{
                if(matrix[i][j] == '1'){
                       arr[i][j]= Math.min(arr[i-1][j-1],Math.min(arr[i-1][j],arr[i][j-1]))+1;
                }     
               }       
                ans = Math.max(ans,arr[i][j]);
            }
        }
        return ans*ans;
    }
}