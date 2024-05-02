class Solution {
    public int findMaxK(int[] nums) {
        int n = nums.length;
        if(n <= 1){
            return -1;
        }
        Arrays.sort(nums);
        int r = n-1;
        int l = 0;
            while( r >= 0 && nums[r] > 0){
                int k = nums[r];
                l = 0;
                while(nums[l] < 0){
                    if(k == Math.abs(nums[l])){
                        return k;
                    }
                    l++;
                }
                r--;
            }
       
        return -1;

    }
}