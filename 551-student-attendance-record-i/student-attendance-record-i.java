class Solution {
    public boolean checkRecord(String s) {
        int cA = 0;
        int cL = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'A'){  
                cA++;
                if (cA > 1) 
                    return false;
            }
            if(s.charAt(i) == 'L'){
                int currL = 0;
                while(i < s.length() && s.charAt(i) == 'L'){
                    currL++;
                    if(currL >= 3) return false;
                    i++;
                }
                i--; 
            } 
        }
        return true;
    }
}