class Solution {
    public int sumOddLengthSubarrays(int[] nums) {
        int oddL=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                if((j-i+1)%2!=0){
                    for (int k = i; k <= j; k++) {
                        sum += nums[k];
                    }
                }
            }
            oddL+=sum;
        }
        return oddL;
    }
}