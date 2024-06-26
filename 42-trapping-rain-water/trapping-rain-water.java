class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];
        int max = height[0];
        for(int i=0;i<n;i++){
            max = Math.max(max,height[i]);
            maxLeft[i] = max;
        } 
        max = height[n-1];
        for(int i=n-1;i>=0;i--){
            max = Math.max(max,height[i]);
            maxRight[i] = max;
        } 
        int water = 0;
        for(int i=0;i<n;i++){
            water += Math.min(maxLeft[i],maxRight[i]) - height[i];
        }
        return water;
    }
}