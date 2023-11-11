class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        int currentElement =0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                currentElement = nums[i];
            }
            if(currentElement==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return currentElement;
    }
}