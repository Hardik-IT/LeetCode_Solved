class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xorNums1 = 0;
        for (int num : nums1) {
            xorNums1 ^= num;
        }

        int xorNums2 = 0;
        for (int num : nums2) {
            xorNums2 ^= num;
        }

        if (nums1.length % 2 == 0 && nums2.length % 2 == 0) {
            return 0;
        } else if (nums1.length % 2 == 1 && nums2.length % 2 == 1) {
            return xorNums1 ^ xorNums2;
        } else if (nums1.length % 2 == 1) {
            return xorNums2;
        } else {
            return xorNums1;
        }
    }
}