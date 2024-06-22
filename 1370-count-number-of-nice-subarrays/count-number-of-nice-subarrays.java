class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length, ans = 0, prefSum = 0;
        HashMap<Integer, Integer> freqOfPrefSum = new HashMap<>();
        freqOfPrefSum.put(0, 1);

        for (int i = 0; i < n; i++) {
            prefSum += (nums[i] % 2 == 1) ? 1 : 0;
            ans += freqOfPrefSum.getOrDefault(prefSum - k, 0);
            freqOfPrefSum.put(prefSum, freqOfPrefSum.getOrDefault(prefSum, 0) + 1);
        }

        return ans;
    }
}