class Solution {
    public List<Integer> findDuplicates(int[] nums)     {
        List<Integer> duplicates = new ArrayList<>();
        int i=0;
        while(i < nums.length){
                int correct=nums[i]-1;
                if( nums[i] != nums[correct]){
                swap(nums,i,correct);
                }else{
                    i++;
                }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k+1)
            duplicates.add(nums[k]);
        }
        return duplicates;
    }
    public void swap(int[] arr,int f, int l)    { 
        int temp = arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
    
}