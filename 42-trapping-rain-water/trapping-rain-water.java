class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int n = height.length;
        int[] ml = new int[n];
        int[] mr = new int[n];
        int max = height[0];
        for(int i = 0; i < n; i++) {
            max = Math.max(max,height[i]);
            ml[i] = max;
        }
        int max1 = height[n-1];
        for(int j = n-1; j >= 0; j--) {
            max1 = Math.max(max1,height[j]);
            mr[j] = max1;
        }

        for(int k = 0; k < n; k++){
            ans += Math.min(ml[k], mr[k]) - height[k];
        }
        return ans;

 
    }
}


