class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftM = new int[height.length];
        int[] rightM = new int[height.length];
        leftM[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftM[i] = Math.max(height[i],leftM[i-1]);
        }
        rightM[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightM[i] = Math.max(height[i],rightM[i+1]);
        }
       
        int sum=0;
        for(int i = 0; i < n; i++){
            sum += Math.min(leftM[i],rightM[i])-height[i];
        }
        return sum;
    }
}