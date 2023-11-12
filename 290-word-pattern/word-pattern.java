class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if(pattern.length()!=strs.length){
            return false;
        }
        HashMap<Character,String> hashmap = new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(!hashmap.containsKey(ch) && hashmap.containsValue(strs[i])){
                    return false;
            } 
            if(hashmap.containsKey(ch) && !hashmap.get(ch).equals(strs[i])){
                    return false;
            }
            else{
                hashmap.put(ch,strs[i]);
            }
        }
        return true;
    }
}