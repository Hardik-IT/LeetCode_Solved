class Solution {
    public int maxScore(String s) {
        String leftZ,rightO;
        int score=0;
        int n = s.length();
        for(int i=0;i<s.length();i++){
            leftZ = s.substring(0,i);
            rightO = s.substring(i,n);
            int leftS = lefCalScore(leftZ);
            int rightS = rigCalScore(rightO);
            int currScore = leftS + rightS;
            if(!(leftZ.isEmpty() || rightO.isEmpty())){
                score = Math.max(score,currScore);
            }
        }
        return score;
    }
    private int lefCalScore(String leftZ){
        int leftS = 0;
        for(int i=0;i<leftZ.length();i++){
            if(leftZ.charAt(i) == '0'){
                leftS++;
            }
        }
        return leftS;
    }
    private int rigCalScore(String rightO){
       int rightS = 0;
        for(int i=0;i<rightO.length();i++){
            if(rightO.charAt(i) == '1'){
                rightS++;
            }
        }
        return rightS;
    }

}