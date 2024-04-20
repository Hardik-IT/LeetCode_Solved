class Solution {
    public int trap(int[] height) {
      int n = height.length;
      int[] ml = new int[n];
      int[] mr = new int[n];

      ml[0] = height[0];
      for(int i=1;i<n;i++){
        ml[i] = Math.max(ml[i-1],height[i]);
      }
      mr[n-1] = height[n-1];
      for(int i=n-2;i>=0;i--){
        mr[i] = Math.max(mr[i+1],height[i]);
      }
      int sum = 0;
      for(int i=0;i<n;i++){
        sum += (Math.min(ml[i],mr[i])) - height[i];
      }
      return sum;
    }
}