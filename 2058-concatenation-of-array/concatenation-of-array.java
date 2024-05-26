class Solution {
    public int[] getConcatenation(int[] nums) {
        int count = 0;
        int n = nums.length;
        int[] res = new int[n*2];
        for(int i=0;i<2*n;i++){
            res[i] = nums[count];
            count++;
            if(count==n){
                count=0;
            }
        }
        return res;
    }
}