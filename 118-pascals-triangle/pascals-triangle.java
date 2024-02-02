class Solution {
    public List<List<Integer>> generate(int numRows) {
        // TC O(n * n * r) ~ O (n^3) SC O(1)
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            List<Integer> temp = new ArrayList<>();
            for(int col=1;col<=row;col++){
                temp.add(ncr(row-1,col-1));
            }
            ans.add(temp);
        }
        return ans;
    }
    public static int ncr(int n,int r){
        long res=1;
        for(int i=0;i<r;i++){
            res = res * (n-i);
            res = res / (i+1);
        }
        return (int)res;
    }
}