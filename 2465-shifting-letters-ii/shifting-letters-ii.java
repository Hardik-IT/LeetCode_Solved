class Solution {
    private void shiftCharacter(StringBuilder s, int start, int end, int direction) {
        for (int i = start; i <= end; i++) {
            char currentChar = s.charAt(i);
            int currentPos = currentChar - 'a';
            int newPos;
            
            if (direction == 1) {
                newPos = (currentPos + 1) % 26;
            } else {
                newPos = (currentPos - 1 + 26) % 26;
            }
            
            s.setCharAt(i, (char) ('a' + newPos));
        }
    }

    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] dp = new int[n + 1];

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            if (direction == 1) {
                dp[start]++;
                dp[end + 1]--;
            } else {
                dp[start]--;
                dp[end + 1]++;
            }
        }

        int prefixSum = 0;
        char[] result = s.toCharArray();
        for (int i = 0; i < n; i++) {
            prefixSum += dp[i];
            int currentPos = result[i] - 'a';
            int newPos = (currentPos + prefixSum % 26 + 26) % 26;
            result[i] = (char) ('a' + newPos);
        }

        return new String(result);
    }

}