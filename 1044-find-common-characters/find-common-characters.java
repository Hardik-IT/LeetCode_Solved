class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        HashMap<Character,Integer> hm = new HashMap<>();
            for(char c : words[0].toCharArray()){
                    hm.put(c,hm.getOrDefault(c,0)+1);
            }

        
        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> wordCount = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);
            }
            for (char c : hm.keySet()) {
                if (wordCount.containsKey(c)) {
                    hm.put(c, Math.min(hm.get(c), wordCount.get(c)));
                } else {
                    hm.put(c, 0);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                res.add(entry.getKey().toString());
            }
        }
        return res;
    }
}