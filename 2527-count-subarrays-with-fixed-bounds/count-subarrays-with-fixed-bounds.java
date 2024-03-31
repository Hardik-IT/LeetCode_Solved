class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        int minI = -1;
        int maxI = -1;
        int badI = -1;
        long ans=0;
        for(int i = 0; i < n; i++){
            if(nums[i] < minK || nums[i] > maxK) badI = i;
            if(nums[i] == minK) minI = i;
            if(nums[i] == maxK) maxI = i;
            ans += Math.max(0,Math.min(minI,maxI)-badI); 
        }
        return ans;
    }
}