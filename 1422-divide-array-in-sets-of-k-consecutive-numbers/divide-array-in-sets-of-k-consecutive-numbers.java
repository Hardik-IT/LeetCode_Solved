class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        if(n % k != 0){
            return false;
        }
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        while (!hm.isEmpty()) {
            int curr = Collections.min(hm.keySet());
            for (int i = 0; i < k; i++) {
                if (!hm.containsKey(curr + i) || hm.get(curr + i) == 0) {
                    return false;
                }
                hm.put(curr + i, hm.get(curr + i) - 1);
                if (hm.get(curr + i) < 1) {
                    hm.remove(curr + i);
                }
            }
        }
        
        return true;
    }
}