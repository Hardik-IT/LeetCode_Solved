class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[][] dp = new int[len1+1][len2+1];
        int ans = 0;
        for(int i=1; i<= len1; i++){
            for(int j=1; j<=len2; j++){
                if(nums1[i-1] == nums2[j-1]){
                    
                    dp[i][j] = dp[i-1][j-1] + 1;  
                    ans = Math.max(dp[i][j],ans);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }
}