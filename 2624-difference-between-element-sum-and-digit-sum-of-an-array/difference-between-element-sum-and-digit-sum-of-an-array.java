class Solution {
    public int differenceOfSum(int[] nums) {
        int digitSum = 0;
        int elementSum = 0;
        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];
            int sum = 0;
            int temp = nums[i];
            if (temp / 10 != 0) {
                while (temp != 0) {
                    int rem = temp % 10;
                    temp = temp / 10;
                    sum += rem;
                }
            } else {
                sum += nums[i];
            }
            digitSum += sum;
        }
        int x = elementSum - digitSum;
        return x;
    }

}