class Solution {
    public int removeDuplicates(int[] nums) {
        int exceptedNums[] = new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                exceptedNums[c]=nums[i];
                c++;
            }
        }
        exceptedNums[c++] = nums[nums.length-1];
        for (int i = 0; i < c; i++) {
            nums[i] = exceptedNums[i];
        System.out.println(exceptedNums[i]);

        } 
        return c;
    }
}