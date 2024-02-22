class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = 1;
        int count=0;
        while(right < nums.length){
            int diff= nums[right] - nums[left];
            if(left == right){
                right++;
                continue;
            }
            if(diff == k ){
                count++;
                right++;
                left++;
                while(right < nums.length && nums[right-1] == nums[right])
                    right++;
                while(left < right && nums[left-1] == nums[left])
                    left++;

            }
            else if(diff < k){
                right++;
            }else{
                left++;
            }
        }
        return count;
    }
}