class Solution {
    public String reversePrefix(String word, char ch) {
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == ch){
                StringBuilder s = new StringBuilder();
                s.append(""+word.substring(0,i+1));
                s.reverse();
                s.append(""+word.substring(i+1,word.length()));
                return s.toString();
            }
        }
        return word;
    }
}