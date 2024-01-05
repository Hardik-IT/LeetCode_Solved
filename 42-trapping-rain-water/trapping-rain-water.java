class Solution {
    public int trap(int[] nums) {
    
        int n= nums.length;
        int sum=0;
        for(int i=0; i<n; i++){
            int j=i;
            int leftMax=0;
            int rightMax=0;
            while (j>=0){
                leftMax = Math.max(leftMax,nums[j]);
                j--;
            }
            j=i;
            while (j<n){
                rightMax = Math.max(rightMax,nums[j]);
                j++;
            }

            sum += Math.min(leftMax,rightMax)- nums[i];
        }
        return sum;

}
}