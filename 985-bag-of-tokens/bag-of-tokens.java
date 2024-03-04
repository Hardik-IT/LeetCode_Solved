class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0;
        int right = tokens.length - 1;
        int score = 0;
        while(left <= right){
            if(tokens[left] <= power){
                power -= tokens[left];
                score++;
                left++;
            }else if(left < right && score > 0){
                power += tokens[right];
                score--;
                right--;
            }else{
                return score;
            }
        }
        return score;
    }
}