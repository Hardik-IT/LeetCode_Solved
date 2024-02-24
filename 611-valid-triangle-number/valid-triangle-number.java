class Solution {

    //  Time complexity - O(n^2(log(n)))

    public int binarySearch(int[] nums,int l,int r,int sum){
        while(r >= l  &&  r < nums.length){
            int mid = (l + r)/2;
            if(nums[mid] >= sum){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }

    public int triangleNumber(int[] nums) {

        // Time complexity - O(n^2)
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length - 2; i++){
            int k = i + 2;
            for(int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++){
                k  =  binarySearch(nums, k , nums.length - 1, nums[i] + nums[j]);
                count += k - j - 1;
            }
        }
        return count;
    }
}