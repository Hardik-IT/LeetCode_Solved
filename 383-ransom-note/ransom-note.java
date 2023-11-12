class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        // for(int i=0;i<ransomNote.length();i++){
        //     for(int j=0;j<magazine.length();j++){
        //         if(ransomNote.charAt(i) == magazine.charAt(j))
        //             retrun true;
        //     }
        // }
        // int i=0;
        // int j=0;
        // int c=0;
        // while(i<ransomNote.length()){
            
        // }
        // if(c){
        //     return true;
        // }else
        //     return false;

        int[] count = new int[26];
        for(char ch:magazine.toCharArray()){
            count[ch-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            count[ch-'a']--;
            if(count[ch-'a']<0){
                return false;
            }
        }
        return true;
    }
}