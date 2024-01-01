class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums2 = new int[nums.length + nums.length];
        int count =0;
        for(int i=0;i<nums2.length;i++){
            nums2[i] = nums[count];
            if(nums.length-1==i){
                count=0;
            }else{
                count++;
            }
        }
        
        return nums2;
    }
}