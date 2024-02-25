class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[i]==nums[j]){
                    if(nums[j]==nums[j+1]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}