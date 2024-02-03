class Solution {
    public int sumOddLengthSubarrays(int[] nums) {
        int oddL=0;
        for(int i=0;i<nums.length;i++){
            int subarraySum=0;
            for(int j=i;j<nums.length;j++){
                subarraySum += nums[j];
                if ((j - i + 1) % 2 != 0) {
                    oddL += subarraySum;
                }                
            }
        }
        return oddL;
    }
}