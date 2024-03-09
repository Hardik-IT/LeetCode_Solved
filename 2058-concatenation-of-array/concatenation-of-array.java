class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] res=new int[2*n];
        int c=0;
        for(int i=0;i<2*n;i++){
            if(c==n) c=0;
            res[i]=nums[c];
            c++;
        }
        return res;
    }
}