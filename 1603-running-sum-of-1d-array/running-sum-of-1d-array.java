class Solution {
    public int[] runningSum(int[] nums) {
        int[] runSum = new int[nums.length];
        runSum[0]=nums[0];
        if(nums.length > 1){
            for(int i=1;i<nums.length;i++){
                runSum[i]=nums[i]+runSum[i-1];
            }
        }else{
            return runSum;
        }
        return runSum;
    }
}