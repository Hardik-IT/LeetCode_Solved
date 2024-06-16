class Solution {
    public int minPatches(int[] nums, int n) {
        long maxR = 0;
        int patchC = 0;
        int i = 0;
        while(maxR < n){
            if(i < nums.length && nums[i] <= maxR+1){
                maxR += nums[i];
                i++;
            }else{
                maxR += maxR + 1;
                patchC++;
            }
        }
        return patchC;
    }
}