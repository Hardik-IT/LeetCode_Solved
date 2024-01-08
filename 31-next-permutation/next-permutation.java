class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int min_i = n-1;
        int i=n-2;
        for(;i>=0;i--){
            if(nums[i] < nums[i+1]){
                min_i=i;
                break;
            }
        }
        if(i==-1){
            reverseArray(nums,0,n-1);
            return;
        }
        int second_min_i = min_i+1;
        for(int j=min_i+1;j<n;j++){
            if(nums[j] > nums[min_i] && nums[j] <= nums[min_i+1]){
                second_min_i = j;
            }
        } 
        int temp=nums[min_i];
        nums[min_i] = nums[second_min_i];
        nums[second_min_i]=temp;
        reverseArray(nums,min_i+1,n-1);
        
    }
    public void reverseArray(int[] nums,int s,int e){
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
       }  
    }
}
