class Solution {

    public static int lowerBound(int []arr, int n, int x){
        // Write your code here.
        int start=0;
        int end=n-1;
        int ans=n;
        while(start<= end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=x){
                ans=mid;
                end=mid-1;                
            }else{
                start=mid+1;
            }
        }
        return ans;
    }

    public static int upperBound(int []arr, int n, int x){
        // Write your code here.
        int start=0;
        int end=n-1;
        int ans=n;
        while(start<= end){
            int mid=start+(end-start)/2;
            if(arr[mid]>x){
                ans=mid;
                end=mid-1;                
            }else{
                start=mid+1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int lb=lowerBound(nums,nums.length,target);
        if (lb == nums.length || nums[lb] != target) return new int[] { -1, -1};
        int ub=upperBound(nums,nums.length,target);
        return new int[]{lb,ub-1};
    }
}