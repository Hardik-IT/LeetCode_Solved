class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }   
        int ans=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            int diff =(nums[i] - nums[i-1]);
            if(ans < diff)
                ans= diff;
        }
        return ans;

    }
}