class Solution {
    public int subsetXORSum(int[] nums) {
        int totalSum = 0;
         for (int num : nums) {
            totalSum |= num;
        }
        return totalSum << (nums.length - 1);
    }
}