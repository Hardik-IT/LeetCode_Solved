class Solution {
    public int maxProductDifference(int[] nums) {
        int maxP=Integer.MIN_VALUE;
        int minP=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){  
                maxP = Math.max(maxP,(nums[i]*nums[j]));
                minP = Math.min(minP,(nums[i]*nums[j]));
            }
        }
        return maxP-minP;
    }
}