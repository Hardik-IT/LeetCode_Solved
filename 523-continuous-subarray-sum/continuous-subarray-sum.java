class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> remMap = new HashMap<>();
        remMap.put(0,-1);
        int prefixSum = 0;
        for(int i =0; i < n; i++){
            prefixSum += nums[i];
            int rem = k == 0 ? prefixSum : prefixSum % k;
            if(remMap.containsKey(rem)){
                if(i - remMap.get(rem) > 1){
                    return true;
                }
            }else{
                remMap.put(rem,i);
            }
        }
        return false;
    }
}