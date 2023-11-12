import java.util.Scanner;
class Solution {
    public boolean isPalindrome(String s) {
        // String s1="";
        // String s2 = "";        
        // char ch = '';
        // s = s.toLowerCase();
        // for(int i=0;i<s.length();i++){
        //     if (s.charAt(i)>64 && s.charAt(i)<=122 && s.charAt(i)!=32) {   
        //         s1+=s.charAt(i);
        //     }
        // }
       
        // for(int i=0;i<s1.length();i++){
        //     ch = s1.charAt(i);
        //     s2 = ch+s2;
        // }       
        // System.out.println(s1 + " " + s2);
        // if(s1.equals(s2))
        //     return true;
        // else
        //     return false;
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        int n=sb.length()-1;
        for(int j=0;j<sb.length()/2;j++){
            if(sb.charAt(j)!=sb.charAt(n-j))
                return false;
        }
        return true;
    }
}