class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        String ans="";
        for(char ch:order.toCharArray()){
            while(map.containsKey(ch)){
                ans += ch;
                map.put(ch,map.getOrDefault(ch,0)-1);
                if(map.get(ch)<1)
                    map.remove(ch);
            }
        }
        for(char ch:map.keySet()){
            for (int i = 0; i < map.get(ch); i++) {
                ans+=ch;
            }
        }
        return ans;
    }
}