class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = hand.length;
        if(n%groupSize != 0){
            return false;
        }
        for(int num : hand){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        while (!hm.isEmpty()) {
            int curr = Collections.min(hm.keySet());
            for (int i = 0; i < groupSize; i++) {
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




 
