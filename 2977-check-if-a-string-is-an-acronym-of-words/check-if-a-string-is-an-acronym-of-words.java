class Solution {
    public boolean isAcronym(List<String> words, String s) {
            String sWords="";
            for(int i=0;i<words.size();i++){
                 sWords += (words.get(i).charAt(0));
            }
            if(s.equals(sWords)){
                return true;
            }else
               return false;
    }
}