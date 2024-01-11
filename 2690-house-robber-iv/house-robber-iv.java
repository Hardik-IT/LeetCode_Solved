class Solution {
    public int minCapability(int[] nums, int k) {
        
        int l = Arrays.stream(nums).min().getAsInt();
        int r = Arrays.stream(nums).max().getAsInt();

        while(l < r){
            int mid = l+(r-l)/2;
            int steal=0;
            for(int i=0;i<nums.length;){
                if(nums[i] <= mid){
                    ++steal;
                    i+=2;
                }else{
                    ++i;
                }
            }

            if(steal>=k){
                r = mid;
            }else{
                l=mid+1;
            }
        }
        return l;

    }
}