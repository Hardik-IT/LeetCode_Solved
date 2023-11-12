class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        HashMap<Character,Character> MapCharRepl = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!MapCharRepl.containsKey(sChar)){
                if(!MapCharRepl.containsValue(tChar)){
                    MapCharRepl.put(sChar,tChar);
                }else{
                    return false;
                }
            }else{
                char rChar = MapCharRepl.get(sChar);
                    if(rChar != tChar){
                        return false;
                    }
            }
        }
        return true;

    }
}