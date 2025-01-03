class Solution {
    public int waysToSplitArray(int[] nums) {
        // int n = nums.length;
        // int[] pNums = new int[n];
        // int[] dNums = new int[n];
        // int validSplit=0;
        // int sum = 0;
        // if(n==2){
        //     if(nums[0] >= nums[1])
        //         return 1;
        //     else
        //         return 0;    
        // }
        // if(n < 2){
        //     return 0;
        // }
        // for(int i=0;i<n;i++){
        //     sum += nums[i];
        //     pNums[i] = sum;
        // }
        // sum = 0;
        // for(int i=n-1;i>=0;i--){
        //     sum += nums[i];
        //     dNums[i] = sum;
        // }
        // for(int i=0;i<n-1;i++){
        //     if(pNums[i] >= dNums[i+1]){
        //             validSplit++;
        //     }
        // }
        // return validSplit;
        
        
        int n = nums.length;
        long totalSum = 0;
        int validSplits = 0;
        
        for (int num : nums) {
            totalSum += num;
        }
        
        long prefixSum = 0;
        
        for (int i = 0; i < n - 1; i++) {
            prefixSum += nums[i];
            long suffixSum = totalSum - prefixSum;
            
            if (prefixSum >= suffixSum) {
                validSplits++;
            }
        }
        
        return validSplits;

    }
}