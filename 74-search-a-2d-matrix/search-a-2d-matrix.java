class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int i=0,j=cols-1;
        while(i < rows && j >= 0){
            int curr=matrix[i][j];
            if(target == curr){
                return true;
            }
            if(target > curr){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}