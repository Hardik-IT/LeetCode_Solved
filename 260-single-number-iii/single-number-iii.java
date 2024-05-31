class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) ^ nums[i]);
        }
        int f=0,s=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]) != 0){
                if(f!=s){
                    f = nums[i];
                }else{
                    s = nums[i];
                }
            }
        }
        return new int[]{f,s};

    }
}