class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long sum = 0;
        int count = 0;
        int minNuksaan = Integer.MAX_VALUE;

         for (int num : nums) {
            if ((num ^ k) > num) {
                count++; 
                sum += (num ^ k);
            } else {
                sum += num;
            }
            minNuksaan = (int) Math.min((long) minNuksaan, Math.abs(num - (num ^ k)));
        }

        if (count % 2 == 0) {
            return sum;
        }

        return sum - minNuksaan;
    }
}