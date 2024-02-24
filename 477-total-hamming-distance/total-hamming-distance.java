class Solution {
    public int totalHammingDistance(int[] nums) {
        //TLE
        int totalHD = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int res = nums[i] ^ nums[j];
                totalHD += Integer.bitCount(res);
            }
        }
        return totalHD;
    }
}