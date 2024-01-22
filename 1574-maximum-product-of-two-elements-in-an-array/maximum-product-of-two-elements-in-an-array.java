class Solution {
    public int maxProduct(int[] nums) {
        int maxP=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                maxP=Math.max(maxP,((nums[i]-1)*(nums[j]-1)));
            }
        }
        return maxP;
    }
}