class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> set = new HashSet<>();
       int start=0,end=0;
       int max = 0;
       while(end < s.length()){
            // works until it becomes valid
            while(end < s.length() && !set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
            }
            // possible answers
            max = Math.max(max,end-start);
            // work until it back to valid
            while(end < s.length() && set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
       }
       return max;
    }
}