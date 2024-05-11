class Solution {
    public String shortestCommonSupersequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] dp = new int[len1+1][len2+1];
        for(int i=1; i<= len1; i++){
            for(int j=1; j<=len2; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(len2 > 0 && len1 > 0)
        {
            if(text1.charAt(len1-1) == text2.charAt(len2-1)){
                sb.append(text1.charAt(len1-1));
                len2--;
                len1--;
            }
            else{
                if(dp[len1-1][len2] > dp[len1][len2-1]){
                    sb.append(text1.charAt(len1-1));
                    len1--;
                }else{
                    sb.append(text2.charAt(len2-1));
                    len2--;
                }

            }
        }
        while(len1 > 0){
            sb.append(text1.charAt(len1-1));
            len1--;
        }
        while(len2 > 0){
            sb.append(text2.charAt(len2-1));
            len2--;
        }
        return sb.reverse().toString();
    }
}