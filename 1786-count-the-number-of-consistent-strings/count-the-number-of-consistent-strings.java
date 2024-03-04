class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> allowedSet = new HashSet<>(); 
        for(int i=0;i<allowed.length();i++){
            allowedSet.add(allowed.charAt(i));            
        }
        int res=0;
        for(int i=0;i<words.length;i++){
            boolean flag=false;
            for(int j=0;j<words[i].length();j++){
                if(!allowedSet.contains(words[i].charAt(j))){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                res++;
            }
        }
        return res;
    }
}