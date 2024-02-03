class Solution {
    public int[] numberGame(int[] nums) {

        int[] res= new int[nums.length];
        Arrays.sort(nums);
        int alice=1;
        int bob=0;
        for(int j=1;j<nums.length;j+=2){
            res[bob]=nums[j];
            bob+=2;
        }
        for(int i=0;i<nums.length;i+=2){
            res[alice]=nums[i];
            alice+=2;
        }
        return res;
    }
}