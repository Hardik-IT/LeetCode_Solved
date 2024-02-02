class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int rows=0;
        int cols=matrix[0].length-1;
        int[][] resMatrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                resMatrix[j][cols]=matrix[i][j];
            }
            rows++;
            cols--;
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(resMatrix[i][j]+" ");
        //     }
        // }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=resMatrix[i][j];
            }
        }
        
    }
}