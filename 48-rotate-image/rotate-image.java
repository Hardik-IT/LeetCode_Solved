class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //Transpose
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        //reverse rows
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][n-1-j];
                matrix[i][n-1-j]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        // Brute Force
        // int n=matrix.length;
        // int rows=0;
        // int cols=matrix[0].length-1;
        // int[][] resMatrix=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         resMatrix[j][cols]=matrix[i][j];
        //     }
        //     rows++;
        //     cols--;
        // }
        // // for(int i=0;i<n;i++){
        // //     for(int j=0;j<n;j++){
        // //         System.out.print(resMatrix[i][j]+" ");
        // //     }
        // // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         matrix[i][j]=resMatrix[i][j];
        //     }
        // }
        
    }
}