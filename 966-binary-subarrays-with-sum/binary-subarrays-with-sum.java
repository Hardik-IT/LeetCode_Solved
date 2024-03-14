class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int pSum = 0;
        int ans = 0;    
        for(int i=0;i<nums.length;i++){
            pSum += nums[i];
            ans += map.getOrDefault(pSum - k,0);
            map.put(pSum,map.getOrDefault(pSum,0)+1);
        }
        return ans;
    }
}