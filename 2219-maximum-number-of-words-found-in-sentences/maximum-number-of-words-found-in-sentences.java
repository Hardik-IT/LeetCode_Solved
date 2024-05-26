class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxW = Integer.MIN_VALUE;
        for(String sent : sentences){
            String[] words = sent.split(" ");
            maxW = Math.max(words.length,maxW);
        }
        return maxW;
    }
}