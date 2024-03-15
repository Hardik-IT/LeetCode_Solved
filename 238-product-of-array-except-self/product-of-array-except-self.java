class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        res[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1]*nums[i];
        }
        int suffix = 1;
        for(int i=nums.length-1;i>0;i--){
            res[i] = res[i-1]*suffix;
            suffix=suffix*nums[i];
        }
        res[0]=suffix;
        return res;
    }
    
}