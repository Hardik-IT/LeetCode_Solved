class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }   
        int ans=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            int diff =Math.abs(nums[i-1] - nums[i]);
            if(ans < diff)
                ans= diff;
        }
        return ans;

    }
}