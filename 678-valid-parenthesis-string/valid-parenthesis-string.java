class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0; // 0
        int maxOpen = 0; // 0
        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++; 
                maxOpen++; 
            } else if (c == ')') {  
                if (minOpen > 0) { 
                    minOpen--; 
                }
                maxOpen--;
            } else {
                if (minOpen > 0) {
                    minOpen--;
                }
                maxOpen++;
            }
            
            if (maxOpen < 0) {
                return false; // More ')' than '(' or '*' encountered
            }
        }
        return minOpen == 0;
    }
}