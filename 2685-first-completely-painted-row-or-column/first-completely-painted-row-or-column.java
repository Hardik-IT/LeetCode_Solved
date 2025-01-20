class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        boolean[][] path = new boolean[rows][cols];
        int[] rowCount = new int[rows];
        int[] colCount = new int[cols];


        Map<Integer, int[]> positionMap = new HashMap<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                positionMap.put(mat[i][j], new int[]{i, j});
            }
        }

        for (int index = 0; index < arr.length; index++) {
            int number = arr[index];
            if (positionMap.containsKey(number)) {
                int[] pos = positionMap.get(number);
                int r = pos[0];
                int c = pos[1];
                
                path[r][c] = true;
                rowCount[r]++;
                colCount[c]++;
                
                if (rowCount[r] == cols || colCount[c] == rows) {
                    return index;
                }
            }
        }
        
        return -1; 

    }
}