class Solution {
    public int longestIdealString(String s, int k) {
        HashMap<Character,Integer> freqM = new HashMap<>();
        int longest = 1;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int c = (int)ch;
            int maxL = 1;
            for(int req=c-k; req<=c+k; req++)
            {
                if(freqM.containsKey((char)req))
                {
                    maxL = Math.max(maxL, freqM.get((char)req) + 1);
                }
            }
            longest = Math.max(maxL, longest);
            freqM.put(ch,maxL);
        }
        return longest;
    }
}