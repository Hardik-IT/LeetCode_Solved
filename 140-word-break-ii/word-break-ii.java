class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        List<String> res = new ArrayList<>();
        backtrack(s, 0, set, "", res);
        return res;
    }
    
    private void backtrack(String s, int index, HashSet<String> set, String currSentence, List<String> res) {
        int n = s.length();
        if (index == n) {
            res.add(currSentence.trim());
            return;
        }    
        for (int j = index; j < n; j++) {
            String word = s.substring(index, j + 1);
            if (set.contains(word)) {
                String newSentence = currSentence + (currSentence.isEmpty() ? "" : " ") + word;
                backtrack(s, j + 1, set, newSentence, res);
            }
        }
    }
}
