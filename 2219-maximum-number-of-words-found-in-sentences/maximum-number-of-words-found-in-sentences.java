class Solution {
    public int mostWordsFound(String[] sentences) {
        int wordsCount=0;
        for(int i=0;i<sentences.length;i++){
            String[] sentence = sentences[i].split(" ");
            if(wordsCount < sentence.length){
                wordsCount = sentence.length;
            } 
        }
        return wordsCount;
   } 
}