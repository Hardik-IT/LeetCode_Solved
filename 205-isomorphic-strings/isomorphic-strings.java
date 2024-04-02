class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!map.containsKey(sChar)){
                if(!map.containsValue(tChar)){
                    map.put(sChar,tChar);
                }else{
                    return false;
                }
            }else{
                char rChar  = map.get(sChar);
                if(rChar != tChar){
                    return false;
                }
            }
        }
        return true;
    }
}