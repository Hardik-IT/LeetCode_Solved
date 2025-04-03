class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxTriVal = 0;
        int n= nums.length;
        // prefix max
        int[] max_left = new int[n];
        max_left[0] = nums[0];
        for (int i = 1; i < n; i++) {
            max_left[i] = Math.max(max_left[i - 1], nums[i]);
        }

        // suffix max k > j
        int[] max_right = new int[n];
        max_right[n - 1] = nums[n - 1];
        for (int k = n - 2; k >= 0; k--) {
            max_right[k] = Math.max(max_right[k + 1], nums[k]);
        }

        // Iterate over j and find best i before j and best k after j
        for (int j = 1; j < n - 1; j++) {
            long max_i = max_left[j - 1]; // Best i before j
            long max_k = max_right[j + 1]; // Best k after j
            long tripletValue = (max_i - nums[j]) * max_k;
            maxTriVal = Math.max(maxTriVal, tripletValue);
        }

        return maxTriVal;
    }
}