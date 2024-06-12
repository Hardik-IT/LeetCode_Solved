class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;
        int low=0; // 0 - low-1 (Zeros)
        int mid=0; // low - mid-1 (Ones)
        int high = n-1; //mid - n-1 (unserted - 2)
        while(mid <= high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp= nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}