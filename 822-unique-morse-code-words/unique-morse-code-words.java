class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
        "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character,String> morseMap = new HashMap<>();
        int c=0;
        for(char ch='a';ch<='z';ch++){
            morseMap.put(ch,morse[c]);
            c++;
        }
        int count=0;
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<words.length;i++){
            String s="";
            for(int j=0;j<words[i].length();j++){
                s += morseMap.get(words[i].charAt(j));
            }
            if(!set.contains(s)){
                set.add(s);
                count++;
            }
        }
        return count;
    }
}