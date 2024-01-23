class Solution {
    public int[] getConcatenation(int[] nums) {
       int n=nums.length;
       int[] nums2 = new int[2*n];
       int count=0;
       for(int i=0;i<nums2.length;i++){
           if(count==n)
                count=0;
           nums2[i]=nums[count];
           count++;
       }
       return nums2;
    }
}