class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String str1="";
        for(int i=0;i<k;i++){
            if(k-1==i){
                str1 = str1 + words[i];                
            }else{
                str1 = str1 + words[i]+" ";            
            }
        }
        return str1;
    }
}