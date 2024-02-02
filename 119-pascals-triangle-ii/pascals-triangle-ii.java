class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex = rowIndex +1;
        List<Integer> ans=new ArrayList<>();
        for(int c=1;c<=rowIndex;c++){
            ans.add(ncr(rowIndex-1,c-1));
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