class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefixArr=new int[arr.length];
        prefixArr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixArr[i]= prefixArr[i-1] ^ arr[i];
        }
        
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int L = queries[i][0];
            int R = queries[i][1];
            if (L == 0) {
                res[i] = prefixArr[R];
            } else {
                res[i] = prefixArr[R] ^ prefixArr[L - 1];
            }
        }
        return res;
    }
}