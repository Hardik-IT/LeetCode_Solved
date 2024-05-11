class Solution {
    public int longestPalindromeSubseq(String s) {
      StringBuilder s2 = new StringBuilder(s).reverse();
       int len1 = s.length();
       int len2 = s2.length();
       int[][] dp = new int[len1+1][len2+1];
       for(int i=1;i<=len1;i++){
        for(int j=1;j<=len2;j++){
            if(s.charAt(i-1) == s2.charAt(j-1)){
                dp[i][j] = dp[i-1][j-1] + 1;
            }else{
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
       } 
       return dp[len1][len2];
    }
}