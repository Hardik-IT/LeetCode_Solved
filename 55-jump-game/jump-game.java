class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int startI = n - 1;
        for(int i=n - 2;i >= 0; i--){ 
            if((nums[i] + i) >= startI){
                startI = i;
            }
        }
        return startI==0;
    }
}