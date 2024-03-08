class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        for(int val:map.values()){
            max = Math.max(max,val);
        }
        int count=0;
        for(int val:map.values()){
            if(max==val) count+=max;
        }

        return count;
    }
}