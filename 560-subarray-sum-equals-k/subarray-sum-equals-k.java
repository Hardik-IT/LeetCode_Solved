class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        hashmap.put(0,1);
        int prefixSum=0,count=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            int remove = prefixSum - k;
            count = count + hashmap.getOrDefault(remove,0);
            hashmap.put(prefixSum,hashmap.getOrDefault(prefixSum,0)+1);
        }
        return count;

    }
}