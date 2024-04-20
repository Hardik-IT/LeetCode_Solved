class Solution {
    public int[][] findFarmland(int[][] land) {
        int m = land.length;
        int n = land[0].length;
        List<int[]> ans = new ArrayList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(land[i][j]==1){
                    int x = i, y = j;
                    for(x = i; x < m && land[x][j] == 1; x++){
                        for( y = j; y < n && land[x][y] == 1; y++){
                            land[x][y]=0;
                        }
                    }
                    int[] arr = new int[]{i, j, x - 1, y - 1};
                    ans.add(arr);
                }
            }
        }
        return ans.stream().toArray(int[][] :: new);
    }
}