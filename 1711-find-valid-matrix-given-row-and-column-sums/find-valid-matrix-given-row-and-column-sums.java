class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int N = rowSum.length;
        int M = colSum.length;
        int[][] matrix = new int[N][M];

        Set<Integer> rSet = new HashSet<>();
        Set<Integer> cSet = new HashSet<>();
        
        while(rSet.size()!= N && cSet.size() != M){
            int rI = minInd(rowSum,rSet);
            int cI = minInd(colSum,cSet);
            if(rowSum[rI] < colSum[cI]){
                matrix[rI][cI] = rowSum[rI];
                colSum[cI] -= rowSum[rI];
                rSet.add(rI);
            }else{
                matrix[rI][cI] = colSum[cI];
                rowSum[rI] -= colSum[cI];
                cSet.add(cI);
            }
        }
        return matrix;
    }
    public int minInd(int[] sum,Set<Integer> set){
        int min=Integer.MAX_VALUE;
        int minI = 0;
        for(int i=0;i<sum.length;i++){
            if(sum[i] < min && !set.contains(i)){
                min = sum[i];
                minI = i;
            }
        }

        return minI;
    }
}