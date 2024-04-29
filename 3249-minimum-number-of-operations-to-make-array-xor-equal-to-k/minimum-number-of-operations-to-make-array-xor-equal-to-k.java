class Solution {
    public int minOperations(int[] nums, int k) {
        int totalXor = 0;
        for(int num:nums){
            totalXor = totalXor ^ num;
        }
        int diff = totalXor ^ k;
        return Integer.bitCount(diff);
    }
}