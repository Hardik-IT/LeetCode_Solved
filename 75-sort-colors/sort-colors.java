class Solution {
    public void sortColors(int[] nums) {
        // DNF TC - O(N) SC - O(1)
        int low=0,mid=0,high=nums.length-1;
        while(mid <= high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid]=nums[low];
                nums[low]= temp;
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]= temp;
                high--;
            }
        }


        // Brute Force TC - O(2N) SC - O(1)
        // int countZero=0,countOne=0,countTwo=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0)
        //         countZero++;
        //     else if(nums[i]==1)
        //         countOne++;
        //     else 
        //         countTwo++;
        // }
        // for(int i=0;i<countZero;i++){
        //     nums[i] = 0;
        // }
        // for(int i=countZero;i<countZero+countOne;i++){
        //     nums[i] = 1;
        // }
        // for(int i=countZero+countOne;i<nums.length;i++){
        //     nums[i] = 2;
        // }
    }
}