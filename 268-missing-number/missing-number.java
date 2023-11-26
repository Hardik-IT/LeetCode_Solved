class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
       while(i < nums.length){
            int correct=nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]!=k)
               return k;
        }
        return nums.length;
    }
    public void swap(int[] arr,int f, int l)    { 
        int temp = arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
}