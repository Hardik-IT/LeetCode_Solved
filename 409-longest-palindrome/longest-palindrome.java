class Solution {
    public int longestPalindrome(String s) {
         HashSet<Character> charSet = new HashSet<>();
         int len = 0;
         for (char c : s.toCharArray()) {
            if(charSet.contains(c)){
                charSet.remove(c);
                len+=2;
            }else{
                charSet.add(c);
            }
        }
        if(!charSet.isEmpty()){
            len += 1;
        }
        return len;
    }
}