class Solution {
    public long wonderfulSubstrings(String word) {
        HashMap<Long, Long> map = new HashMap<>();
        map.put(0L, 1L); 
        int cum_xor = 0;
        long result = 0;
        for (char ch : word.toCharArray()) { // O(n)
            int shift = ch - 'a';
            cum_xor ^= (1 << shift);
            result += map.getOrDefault((long) cum_xor, 0L); // all characters are even in count
            for (char ch1 = 'a'; ch1 <= 'j'; ch1++) { // O(10)
                shift = ch1 - 'a';
                long check_xor = (cum_xor ^ (1 << shift));
                result += map.getOrDefault(check_xor, 0L);
            }
            map.put((long) cum_xor, map.getOrDefault((long) cum_xor, 0L) + 1);
        }
        return result;
    }
}