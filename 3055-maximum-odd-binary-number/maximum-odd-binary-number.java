class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        String ans="";
        for(int i=0;i<s.length()-1;i++){
            if(count > 1){
                ans+='1';
                count--;
            }else{
                ans+="0";
            }
        }
        ans+="1";
        return ans;
    }
}