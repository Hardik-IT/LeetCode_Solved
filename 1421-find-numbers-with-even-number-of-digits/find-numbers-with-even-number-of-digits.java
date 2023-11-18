class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int ic=0;
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                ic++;
            }
            System.out.println(ic);
            if(ic%2==0){
                c++;
            }            
        }
        return c;
    }
}