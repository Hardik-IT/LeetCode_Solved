class Solution {
    public int maxSubArray(int[] nums) {
       
        // Step 3 - Optimize to O(n)
        int n=nums.length;   
        int maxSum=Integer.MIN_VALUE; 
        int currSum=0;     
        for(int i=0;i<n;i++){
			currSum+= nums[i];
			if(currSum>maxSum){
				maxSum=currSum;
			}
			if(currSum<0){
				currSum=0;
			}
		}
		return maxSum;


        // Step 2 - Brute Force - TLE Error O(n^2)    
        // int maxSum=Integer.MIN_VALUE; 
        // int n=nums.length;        
        // for(int i=0;i<n;i++){
        //      int currSum=0;
        //     for(int j=i;j<n;j++){
        //           currSum+=nums[j];
        //          if(currSum>maxSum){
        //             maxSum=currSum;
        //         }
        //     }           
        // }
        // return maxSum;

        // Step 1 - Brute Force -> TLE Error O(n^3)
        // int maxSum=Integer.MIN_VALUE; 
        // int n=nums.length;        
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //          int currSum=0;
        //          for(int k=i;k<=j;k++){
        //             currSum+=nums[k];
        //         }
        //         if(currSum>maxSum){
        //             maxSum=currSum;
        //         }
        //     }           
        // }
        // return maxSum;

    }
}