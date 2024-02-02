class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
         HashMap<Integer,Integer> freq = new HashMap<>();
         int mini = (int)(nums.length/3)+1;
        for(int i=0;i<nums.length;i++){
            int value = freq.getOrDefault(nums[i], 0);
            freq.put(nums[i], value + 1);
            if(freq.get(nums[i])==mini){
                list.add(nums[i]);
            }
        }
        return list;
    }
}