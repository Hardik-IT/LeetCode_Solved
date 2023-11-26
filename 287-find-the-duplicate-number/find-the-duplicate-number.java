class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correct=nums[i]-1;
            if( nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]!=k+1)
               return nums[k];
        }
        return nums.length;
    }
    public void swap(int[] arr,int f, int l)    { 
        int temp = arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
}