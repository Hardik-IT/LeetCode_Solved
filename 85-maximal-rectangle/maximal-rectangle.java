class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[] heights=new int[cols+1];
        int maxA = 0;
        for(char[] row : matrix){
            for(int i=0; i < cols; i++){
                heights[i]= (row[i]=='1') ? heights[i]+1 : 0;
            }
            int n = heights.length;
            for(int i=0;i<n;i++){
                int minH = Integer.MAX_VALUE;
                for(int j=i; j < n; j++){
                    minH = Math.min(minH,heights[j]);
                    int area = minH * (j - i + 1);
                    maxA = Math.max(maxA,area);
                }
            }
        }
        return maxA;

    }
}